package LeetCode;

public class reorderList_143 {
    public static ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void reorderList(ListNode head) {
        ListNode leftMiddle = middleNode(head);
        ListNode head2 = leftMiddle.next;
        leftMiddle.next = null;
        head2 = reverseList(head2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head!=null && head2!=null){
            temp.next = head;
            head = head.next;
            temp = temp.next;

            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        if(head == null) temp.next = head2;
        if(head2 == null) temp.next = head;
        head = dummy.next;
    }

    public static void printList(ListNode head){
        while(head!=null){
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

        System.out.print("Original List: ");
        printList(head);

        reorderList(head);

        System.out.print("Reordered List: ");
        printList(head);

    }
}
