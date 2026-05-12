package LeetCode;

public class LinkedListCycle_141 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Case 1: No cycle
        System.out.println("Has cycle? " + hasCycle(head)); // false

        // Case 2: Create a cycle (5 -> 2)
        head.next.next.next.next.next = head.next;
        System.out.println("Has cycle? " + hasCycle(head)); // true
    }
}
