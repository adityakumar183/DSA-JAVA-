package LeetCode;
import java.util.Arrays;

public class findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_2058 {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1;
        int last = -1;
        int idx = 1;
        int[] arr = {-1, -1};
        int minDist = Integer.MAX_VALUE;
        while (right != null) {
            if (mid.val < left.val && mid.val < right.val || mid.val > left.val && mid.val > right.val) {
                if (first == -1) first = idx;
                if (last != -1) {
                    int dist = idx - last;
                    minDist = Math.min(minDist, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if (first == last) return arr;
        int maxDist = last - first;
        arr[0] = minDist;
        arr[1] = maxDist;
        return arr;
    }

    public static void main(String[] args) {
        // head = [5,3,1,2,5,1,2]
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);

        int[] arr = nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(arr));
    }
}

/*
      A critical point in a linked list is defined as either a local maxima or a local minima.
      A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
      A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
 */