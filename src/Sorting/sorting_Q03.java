package Sorting;
/*
     Given an array of size N containing only Os, 1s, and 2s; sort the array in ascending order.
     Input: N=6
     arr[]={0 2 1 2 0 0}
     Output: 0 0 0 1 2 2
 */
import java.util.Scanner;
public class sorting_Q03 {
    public static void sortarr(int [] arr){
        int n = arr.length;

        // Dutch flag algorithm:-

        int mid=0,low=0,hi=n-1;
        while(mid<=hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if (arr[mid] == 1) mid++;
            else {                       // arr[mid]==2
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }

    public static void display(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the ele of array(0-2) : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array: ");
        display(arr);

        sortarr(arr);

        System.out.println("Output Array: ");
        display(arr);
    }
}
