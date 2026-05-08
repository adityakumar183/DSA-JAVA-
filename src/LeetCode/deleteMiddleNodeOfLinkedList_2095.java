package LeetCode;

public class deleteMiddleNodeOfLinkedList_2095 {
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int mid = n / 2;
        temp = head;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
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
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        head = deleteMiddle(head);

        System.out.print("After Deleting Middle: ");
        printList(head);
    }
}
