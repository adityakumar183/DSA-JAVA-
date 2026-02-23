package Sorting;
import java.util.Random;

public class quickSort_MT {
    public static int partition(int[] arr, int st, int end){
        // Random pivot
        Random rd = new Random();
        // pick random index between st and end
        int randomIdx = rd.nextInt(end - st + 1) + st;
        // swap random pivot with start
        swap(arr, st, randomIdx);

        int pivot = arr[st];
        int count = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        int i = st, j = end;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void quicksort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);

        quicksort(arr, st, pi-1);
        quicksort(arr , pi+1, end);
    }

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int [] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,6,8,2,6,9,2,5,7,4};
        int n = arr.length;
        System.out.println("Array before Sorting: ");
        display(arr);

        quicksort(arr,0,n-1);

        System.out.println("Array after sorting: ");
        display(arr);
    }
}
