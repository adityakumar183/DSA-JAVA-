package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target value : ");
        int x=sc.nextInt();
        System.out.print("enter array length : ");
        int n=sc.nextInt();

        int [] arr= new int[n];
        System.out.print("enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        boolean flag=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x) {
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.print("element is found ");
        else System.out.print("element is not found ");
    }
}
