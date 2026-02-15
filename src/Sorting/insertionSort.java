package Sorting;
public class insertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;

            // Move elements greater than key one position ahead
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        for(int i : arr){
             System.out.print(i+" ");
           }
            System.out.println();

        insertionSort(arr);
               System.out.println("Sorted Array:");
               for(int j : arr){
                   System.out.print(j+" ");
               }
    }
}

