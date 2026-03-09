package searching;
import java.util.Scanner;
public class binarySearch {
    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                   left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }

       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           // Input array
           System.out.print("Enter size of array: ");
           int n = sc.nextInt();
           int[] arr = new int[n];

           System.out.println("Enter sorted array elements:");
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
           }

           // Input target
           System.out.print("Enter element to search: ");
           int target = sc.nextInt();

           // Perform search
           int result = binarySearch(arr, target);

           if (result != -1) {
               System.out.println("Element found at index: " + result);
           } else {
               System.out.println("Element not found.");
           }
    }
}

