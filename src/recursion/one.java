package recursion;

public class one {
        // Recursive function to calculate sum of digits
       public static int sumOfDigits(int n) {
            if (n == 0) {
                return 0;  // Base case
            }
            return (n % 10) + sumOfDigits(n / 10);  // Recursive call
        }

        public static void main(String[] args) {
            int num = 1234;
            System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
        }
}

