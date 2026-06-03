package LeetCode;

public class toeplitzMatrix_766 {
    public static boolean isToeplitzMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != arr[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(arr));
    }
}
