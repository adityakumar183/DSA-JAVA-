package Sorting;

public class quickSort {
    public static void quicksort(int[] arr, int st,int end){

        for(int i=st;i<=end;i++) {
            int pivot = arr[st];
            for (int j = st + 1; j < end; j++) {
                if (arr[st] > arr[j]) {
                    swap(arr, st, j);
                }
            }
        }
    }
    public static void display(int [] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {6,3,8,2,3,5,7};
        int n = arr.length;
        System.out.println("Before sorting: ");
        display(arr);
        System.out.println();

        quicksort(arr,0,n-1);
        System.out.println("After sorting: ");
        display(arr);
    }
}
