package LeetCode;

public class splitLinkedListInParts_725 {
    public static int lengthOfList(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        return n;
    }

    public static ListNode[] splitListToParts(ListNode head, int k) {
        int n = lengthOfList(head);
        int size = n/k;
        int extra = n%k;
        ListNode[] arr = new ListNode[k];
        int idx = 0;
        ListNode temp = head;
        int len = 1;
        while(temp!=null){
            int s = size;
            if(extra > 0) s++;
            if(len == 1) arr[idx++] = temp;
            if(len == s){
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                len = 1;
                extra--;
            }
            else{
                len++;
                temp = temp.next;
            }
        }
        return arr;
    }

    public static void printParts(ListNode[] parts) {
        for (int i = 0; i < parts.length; i++) {
            System.out.print("Part " + (i+1) + ": ");
            ListNode temp = parts[i];
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);

        int k = 3;

        ListNode[] result = splitListToParts(head, k);
        printParts(result);
    }
}
