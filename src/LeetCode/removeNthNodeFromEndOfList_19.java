package LeetCode;

public class removeNthNodeFromEndOfList_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        // move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {   // n == len
            // I have to delete the head
            return head.next;
        }
        // move slow and fast together until fast reaches tail
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
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

        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.print("After Removing nth from End: ");
        printList(head);
    }
}
