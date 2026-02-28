package Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class builtInSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // built-in sorting

        System.out.println("Sorted output:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

