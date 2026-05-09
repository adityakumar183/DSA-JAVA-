package LeetCode;

public class middleOfTheLinkedList_876 {
    // Method 01:- two pass solution:-      T.C = O(n)  and  O(1) extra space is used
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int mid = len/2 + 1;
        temp = head;
        for(int i = 1;i<=mid-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();



        /*
        // Method 02:- One Pass Solution / Without Finding The Length / Slow-Fast Approach
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){              // null ka next nahi hota hai
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

         */
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode mid = middleNode(head);
        System.out.print("List from Middle: ");
        printList(mid);
    }
}
