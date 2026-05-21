package LeetCode;

public class reverseLinkedListII_92 {
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
