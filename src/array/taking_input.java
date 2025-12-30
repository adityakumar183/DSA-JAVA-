package array;

import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];

        for(int i=0;i<=4;i++){
            System.out.print("enter " + i +" element : ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
