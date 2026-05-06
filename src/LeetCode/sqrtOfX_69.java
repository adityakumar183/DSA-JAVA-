package LeetCode;

import java.util.Scanner;

public class sqrtOfX_69 {
    public static int mySqrt(int n) {
        int st = 0, end = n;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid;
            if (val == n) {
                return mid;
            } else if (val < n) {
                st = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(mySqrt(n));
    }
}
