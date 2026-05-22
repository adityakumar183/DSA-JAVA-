package LeetCode;

public class reverseLinkedListII_92 {
    public static void reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
    }

    // Method 01:-      T.C = O(n)
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;
        ListNode a = null, b = null, c = null, d = null;
        int pos = 1;
        ListNode temp = head;
        while(temp != null){
            if(pos == left-1) a = temp;
            if(pos == left)  b = temp;
            if(pos == right) c = temp;
            if(pos == right+1)  d = temp;
            temp = temp.next;
            pos++;
        }
        if(a!= null) a.next = null;
        if(c!= null) c.next = null;
        reverseList(b);
        if(a!= null) a.next = c;
        b.next = d;
        if(a == null) return c;
        return head;
    }
    /*
    Method 02 :-
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        ListNode subPrev = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = subPrev;
            subPrev = curr;
            curr = next;
        }

        prev.next.next = curr;
        prev.next = subPrev;

        return dummy.next;
    }

     */

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        int left = 2, right = 4;
        System.out.print("Original List : ");
        printList(head);
        ListNode result = reverseBetween(head, left, right);
        System.out.print("Reversed List : ");
        printList(result);
    }
}
