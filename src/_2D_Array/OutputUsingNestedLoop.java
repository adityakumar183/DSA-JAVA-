package _2D_Array;

import java.util.Scanner;

public class OutputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr=new int[2][3];

        int m=arr.length;      // length of row
        int n=arr[0].length;   // length of column

        // input :->
        System.out.println("enter inputs : ");
        for (int i = 0; i < m; i++) {                // row
            for (int j = 0; j < n; j++) {          // col
                arr[i][j]=sc.nextInt();
            }
        }

        // output :->
        for (int i = 0; i < m; i++) {                // row
            for (int j = 0; j < n; j++) {          // col
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
