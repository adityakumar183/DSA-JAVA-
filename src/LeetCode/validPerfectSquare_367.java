package LeetCode;

import java.util.Scanner;

public class validPerfectSquare_367 {
    public  static boolean isPerfectSquare(int num) {
    if (num < 2) return true; // 1 is a perfect square

    long left = 2, right = num / 2;
    while (left <= right) {
        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if (square == num) {
            return true;
        } else if (square > num) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
