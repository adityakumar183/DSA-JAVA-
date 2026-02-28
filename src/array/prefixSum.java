package array;
import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        // taking array input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // finding prefix sum
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
