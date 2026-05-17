package LeetCode;

public class oddEvenLinkedList_328 {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode temp1 = odd;
        ListNode even = new ListNode(0);
        ListNode temp2 = even;

        ListNode temp = head;
        while(temp!= null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            if(temp == null) break;
            temp = temp.next;
            temp2 = temp2.next;
        }
        odd = odd.next;
        even = even. next;
        temp1.next = even;
        return odd;
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
        head.next.next.next.next = new ListNode(5);

        ListNode result = oddEvenList(head);

        printList(result);
    }
}
