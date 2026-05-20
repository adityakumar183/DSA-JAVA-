package LeetCode;

public class palindromeLinkedList_234 {
    public static ListNode reverseList(ListNode head) {
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
     /*
    // Method 01:-   Create a deep copy
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while(t1 != null){
            ListNode temp = new  ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead = reverseList(newHead);
        t1 = head;
        t2 = newHead;
        while(t1 != null){
            if(t1.val != t2.val) return false;
            t2 = t2.next;
            t1 = t1.next;
        }
        return true;
    }

     */

    // Method 02 :-  reverse the second half of list
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode j = reverseList(slow);
        ListNode i =  head;
        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }
}
