package Sorting;

public class quickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low], pidx = low;
        int smallcount = 0;
        for (int i = low+1; i <= high; i++) {
            if (arr[i] <= pivot) {
                smallcount ++;
            }
        }
        int correctidx = pidx + smallcount;
        swap(arr,pidx,correctidx);
        // partition
        int i = low;
        int j = high;
        while (i<correctidx && j>pidx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;
    }

    public static void quicksort(int[] arr, int lo,int hi){
        if(lo>=hi) return;
        int idx = partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }

    public static void display(int [] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {6,3,8,2,1,4,5,7};
        int n = arr.length;
        System.out.println("Before sorting: ");
        display(arr);

        quicksort(arr,0,n-1);
        System.out.println("After sorting: ");
        display(arr);
    }
}
