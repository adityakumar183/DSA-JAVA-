package LeetCode;

public class powerOfTwo_231 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
}
