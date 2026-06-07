package LeetCode;

public class pow_50 {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;
        while (N > 0) {
            if (N % 2 != 0) {
                ans = ans*x;
            }

            x = x*x;
            N = N/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(myPow(x,n));
    }
}
