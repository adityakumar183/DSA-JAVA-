package LeetCode;

import java.util.Scanner;

public class SearchA2DMatrices_240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target value : ");
        int x = sc.nextInt();
        int[][] arr = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m = arr.length;
        int n = arr[0].length;
        boolean flag = false;

//        // method 01:->
//        // time limit exceeded....
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == x) {
//                    System.out.print("value found : " + x);
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        if(flag!=true){
//            System.out.print("value not found");
//        }

        // method 02:->
        int i=0 , j=n-1;        // start from top right corner. we can also start from bottom left corner
        while(i<m && j>=0){
            if(arr[i][j]==x){
                flag=true;
                break;
            }
            else if(arr[i][j]>x){   // go left
                j--;
            }
            else{   // go down
                i++;
            }
        }
        if(flag==true) System.out.print("value found");
        else System.out.print("value not found");
    }
}

