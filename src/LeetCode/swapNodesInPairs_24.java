package LeetCode;

public class swapNodesInPairs_24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        temp.next = head;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            ListNode temp2 = second.next;

            temp.next = second;
            second.next = first;
            first.next = temp2;

            temp = first;
            head = temp2;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while(head != null) {
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

        ListNode result = swapPairs(head);
        printList(result);
    }
}
