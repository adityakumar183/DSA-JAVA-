package LeetCode;

import java.util.Arrays;

public class plusOne_66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just increment and return
                return digits;
            }
            digits[i] = 0;     // If digit is 9, set to 0 and continue
        }

        // If all digits were 9, we need an extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
