package Sorting;
/*
      Given an array of positive and negative integers, segregate them in linear time and
      constant space. The output should print all negative numbers, followed by all positive
      numbers.
      Input: [ 19, -20, 7, -4, -13, 11, -5, 3 ]
      Output: [-20, -4, -13, -5, 7, 11, 19, 3 ]
 */
public class sorting_Q02 {
    public static void partition(int [] arr){
        int n = arr.length;
        int l = 0 , r = n-1;
        while(l < r){
            while(arr[l] < 0) l++;
            while(arr[r] >= 0) r--;
            if(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {19,-20,7,-4,-13,11,-5,3};
        System.out.println("Input Array:");
        display(arr);

        partition(arr);

        System.out.println("Output Array:");
        display(arr);
    }
}
