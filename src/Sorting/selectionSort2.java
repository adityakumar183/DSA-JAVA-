package Sorting;

public class selectionSort2 {
    public class RecursiveSelectionSort {
        // Function to perform recursive selection sort
        public static void selectionSortRecursive(int arr[], int start) {
            int n = arr.length;

            // Base case: if start reaches last element
            if (start >= n - 1) {
                return;
            }

            // Assume current index has the minimum
            int minIndex = start;

            // Find index of smallest element in remaining array
            for (int j = start + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of subarray
            int temp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = temp;

            // Recursive call for next index
            selectionSortRecursive(arr, start + 1);
        }

        // Function to print array
        static void printArray(int arr[]) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Main method
        public static void main(String[] args) {
            int arr[] = {64, 25, 12, 22, 11};

            System.out.println("Original Array:");
            printArray(arr);

            selectionSortRecursive(arr, 0);

            System.out.println("Sorted Array:");
            printArray(arr);
        }
    }
}
