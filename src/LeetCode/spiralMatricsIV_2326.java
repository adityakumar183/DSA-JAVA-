package LeetCode;
import java.util.*;

public class spiralMatricsIV_2326 {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }

        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (head != null && minr <= maxr && minc <= maxc) {
            // left to right
            for (int j = minc; j <= maxc && head != null; j++) {
                ans[minr][j] = head.val;
                head = head.next;
            }
            minr++;

            // top to bottom
            for (int i = minr; i <= maxr && head != null; i++) {
                ans[i][maxc] = head.val;
                head = head.next;
            }
            maxc--;

            // right to left
            for (int j = maxc; j >= minc && head != null; j--) {
                ans[maxr][j] = head.val;
                head = head.next;
            }
            maxr--;

            // bottom to top
            for (int i = maxr; i >= minr && head != null; i--) {
                ans[i][minc] = head.val;
                head = head.next;
            }
            minc++;
        }

        return ans;
    }

    public static void main(String[] args) {
        // Linked list: [3,0,2,6,8,1,7,9,4,2,5,5,0]
        ListNode head = new ListNode(3);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);

        int[][] res = spiralMatrix(3, 5, head);

        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
