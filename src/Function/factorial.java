package Function;

import java.util.Scanner;
public class factorial {
    public static void factorial(int n) {
        if (n < 0) {
            System.out.print("invalid number");
            return;
        }

            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.print("factorial is : " + factorial);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();

        factorial(n);
    }
}
