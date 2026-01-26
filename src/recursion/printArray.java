package recursion;

public class printArray {
    public static void printarr(int[] arr , int idx){
        // base case:-
        if(idx == arr.length) return;

        // self work:-
        System.out.print(arr[idx] +" ");

        // recursive work:-
        printarr(arr, idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,11,24,56};

        printarr(arr, 0);
    }
}
