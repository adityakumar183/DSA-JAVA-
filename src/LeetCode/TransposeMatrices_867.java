package LeetCode;

public class TransposeMatrices_867 {
    public static void main(String[] args) {
        int [][]arr= {{1,2,3},{3,4,5},{5,6,7}};
        int m=arr.length;
        int n=arr[0].length;
        int [][] ans= new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j]=arr[j][i];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// isme print na kar ke return ans karna hai