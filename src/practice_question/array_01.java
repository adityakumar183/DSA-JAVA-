package practice_question;

import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        int j=arr.length;

        System.out.print("enter array : ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("arrays are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("array length is : " + j);
    }
}
