package _2D_Array;

public class TransposeMatrices {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6
        int [][]arr= {{1,2},{3,4},{5,6}};
        int m=arr.length;
        int n=arr[0].length;
        int [][] ans= new int[n][m];

        // transpose of matrices print karne ke liya main array ke row ko ans ke column se or column ko row se replace kar do
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j]=arr[j][i];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
