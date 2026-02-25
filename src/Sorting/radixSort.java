package Sorting;
import java.util.*;
public class radixSort {
    // Function to get maximum value in array
    static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
          return max;
        }

        // Counting sort for a specific digit place
        static void countingSort(int arr[], int exp) {
            int n = arr.length;
            int output[] = new int[n]; // sorted array
            int count[] = new int[10]; // digit count (0-9)

            // Count occurrences of digits
            for (int i = 0; i < n; i++)
                count[(arr[i] / exp) % 10]++;

            // Convert count[] to cumulative count
            for (int i = 1; i < 10; i++)
                count[i] += count[i - 1];

            // Build output array (stable sorting)
            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // Copy sorted values back to arr[]
            for (int i = 0; i < n; i++)
                arr[i] = output[i];
        }

        // Main Radix Sort function
        static void radixSort(int arr[]) {
            int max = getMax(arr);

            // Apply counting sort for each digit place
            for (int exp = 1; max / exp > 0; exp *= 10)
                countingSort(arr, exp);
        }

        // Driver code
        public static void main(String[] args) {
            int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

            System.out.println("Original Array: " + Arrays.toString(arr));
            radixSort(arr);
            System.out.println("Sorted Array:   " + Arrays.toString(arr));
     }
}

