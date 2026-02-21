package Sorting;

public class mergeSort {
        // Merge two halves
       public static void merge(int[] arr, int l, int mid, int r) {
            int n1 = mid - l + 1;
            int n2 = r - mid;

            int[] left = new int[n1];
            int[] right = new int[n2];

            for (int i = 0; i < n1; i++)
                left[i] = arr[l + i];
            for (int j = 0; j < n2; j++)
                right[j] = arr[mid + 1 + j];

            int i = 0, j = 0, k = l;
            while (i < n1 && j < n2) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < n1) arr[k++] = left[i++];
            while (j < n2) arr[k++] = right[j++];
        }

        // Recursive sort
       public static void mergeSort(int[] arr, int l, int r) {
            if (l >= r) return;
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

        // display function
        public static void display(int[] arr){
           for(int val : arr){
               System.out.print(val+" ");
            }
        }

        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int n = arr.length;
            System.out.println("Original Array:");
            display(arr);
            System.out.println();

            mergeSort(arr, 0, n-1);

            System.out.println("Sorted array:");
            display(arr);
       }
}