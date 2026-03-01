package Sorting;

public class countSort_M02 {
    public static int findmax(int[] arr){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void countsort(int [] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findmax(arr);

        // Create count array
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {        // frequency count
            count[arr[i]]++;
        }

        // prefix sum array of count array
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        // Find the index of each element in the original array and put it in output array
        for(int i = n-1; i >= 0; i -- ) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
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
        System.out.println("Array before sorting: ");
        display(arr);

        countsort(arr);

        System.out.println("Sorted array: ");
        display(arr);
    }
}
