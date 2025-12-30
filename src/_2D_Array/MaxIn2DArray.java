package _2D_Array;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int [][] arr={{3,2,4},{1,5,7},{6,8,-9}};
        int m=arr.length;
        int n=arr[0].length;
        int mx=Integer.MIN_VALUE;   // array me sabse chota value find karne ka tarika

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx=Math.max(mx,arr[i][j]);  // maximum value find karne ka method
            }
        }
        System.out.print(mx);
    }
}
