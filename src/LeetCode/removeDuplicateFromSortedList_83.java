package LeetCode;

public class removeDuplicateFromSortedList_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode a = head;
        ListNode b = head;
        while(b != null){
            if(b.val == a.val)  b= b.next;
            else{
                a.next = b;
                a = b;
            }
        }
        a.next = null;
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
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(6);

        head = deleteDuplicates(head);
        printList(head);
    }
}
