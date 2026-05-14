package LeetCode;

public class rotateList_61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        k %= n;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i<= k; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;    // slow is now the new tail
        fast.next = head;
        return newHead;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
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

        System.out.print("Original List: ");
        printList(head);

        // Rotate by k = 2
        head = rotateRight(head, 2);

        System.out.print("Rotated List: ");
        printList(head);
    }
}
