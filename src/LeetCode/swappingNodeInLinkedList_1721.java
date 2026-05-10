package LeetCode;

public class swappingNodeInLinkedList_1721 {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast to k-th node
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        ListNode a = fast; // k-th node from start

        // Move fast till end to find k-th from end
        ListNode temp = fast;
        while (temp.next != null) {
            slow = slow.next;
            temp = temp.next;
        }

        ListNode b = slow; // k-th node from end
        // Swap values
        int val = a.val;
        a.val = b.val;
        b.val = val;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
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

        // Print original list
        System.out.print("Original List: ");
        printList(head);

        head =swapNodes(head, 2); // swap 2nd node from start and end

        // Print modified list
        System.out.print("After Swapping: ");
        printList(head);
    }
}
