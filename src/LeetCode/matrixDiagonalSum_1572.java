package LeetCode;

public class matrixDiagonalSum_1572 {
    public static int diagonalSum(int[][] matrics) {
        int n = matrics.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrics[i][i];
            sum += matrics[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            sum -= matrics[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
}
