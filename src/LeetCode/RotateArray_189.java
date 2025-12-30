package LeetCode;

import java.util.Scanner;

public class RotateArray_189 {
    public static void reverse(int [] arr,int i,int j){
        while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter k : ");
        int k=sc.nextInt();
        int [] arr= { 22,45,6,54,23,77,88,56};
        int n=arr.length;
        k= k %n;
        System.out.print("array element: ");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);


        System.out.print("after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
