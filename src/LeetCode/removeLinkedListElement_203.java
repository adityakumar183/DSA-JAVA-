package LeetCode;

public class removeLinkedListElement_203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next = new ListNode(7);

        System.out.println("Original list:");
        printList(head);

        head = removeElements(head, 6);

        System.out.println("List after removing 6:");
        printList(head);
    }
}
