package Sorting;

public class selectionSort {
       public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                // Assume the current index has the minimum
                int minIndex = i;

                // Find the index of the smallest element in the remaining array
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {      // decreasing order me karne ke liye (>) use this
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};

            System.out.println("Original Array:");
            for(int i : arr){
                System.out.print(i+" ");
            }
            System.out.println();

            selectionSort(arr);

            System.out.println("Sorted Array:");
            for(int j : arr){
                System.out.print(j+" ");
            }
        }
    }

