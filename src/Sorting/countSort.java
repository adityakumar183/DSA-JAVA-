package Sorting;

public class countSort {
    public static void countsort(int [] arr, int n){
        // Find the maximum value in arr
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count occurrences
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Build the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void display(int[] arr) {
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        System.out.println("Array before sorting: ");
        display(arr);

        countsort(arr,n);

        System.out.println("Sorted array: ");
        display(arr);
    }
}
