package LeetCode;

public class addTwoNumber_02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 = 0, val2 =0;
            if(l1 != null) val1 = l1.val;
            if(l2 != null) val2 = l2.val;
            int num = val1 + val2 + carry;
            ListNode node = new ListNode(num%10);
            temp.next = node;
            temp = temp.next;
            if(num>9) carry = 1;
            else carry = 0;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry==1){
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }
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
        // List1: 9 -> 9 -> 9 -> 9 -> 9-> 9 -> 9
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        // List2: 9 -> 9 -> 9 -> 9
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);
    }
}
