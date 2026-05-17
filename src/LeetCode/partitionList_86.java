package LeetCode;

public class partitionList_86 {
    public static ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);
        ListNode temp1 = a;
        ListNode b = new ListNode(-1);
        ListNode temp2 = b;

        ListNode temp = head;
        while(temp!= null){
            if(temp.val < x){
                temp1.next = temp;
                temp1 = temp1.next;
            }
            else{
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp2.next = null;  // last node
        a = a.next;
        b = b.next;
        if(a == null) return b;
        temp1.next = b;      // list A attached to list B
        return a;
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
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        System.out.print("Original List: ");
        printList(head);

        ListNode result = partition(head, x);

        System.out.print("Partitioned List (x = " + x + "): ");
        printList(result);

    }
}
