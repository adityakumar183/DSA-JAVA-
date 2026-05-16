package LeetCode;

public class sortList_148 {
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return dummy.next;
    }

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode b = slow.next;
        slow.next = null;
        ListNode firstHalf = sortList(a);
        ListNode secondHalf = sortList(b);
        ListNode ans = merge(firstHalf, secondHalf);
        return ans;
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
        head.next = new ListNode(20);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(44);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(16);
        head.next.next.next.next.next.next = new ListNode(37);

        ListNode sort = sortList(head);
        printList(sort);
    }
}
