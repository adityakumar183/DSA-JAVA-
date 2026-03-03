package Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class builtInSorting {
    public static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("unsorted input array: ");
        display(arr);

        Arrays.sort(arr); // built-in sorting

        System.out.println("Sorted output:");
        display(arr);
    }
}

