package LeetCode;
import java.util.ArrayList;

public class luckyNumberInAMatrix_1380 {
    public static ArrayList<Integer> luckyNumbers (int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        // Step 1: For each row, find the minimum element
        for (int i = 0; i < m; i++) {
            int minVal = arr[i][0];
            int colidx = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                    colidx = j;
                }
            }

            // Step 2: Check if minVal is the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (arr[k][colidx] > minVal) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) result.add(minVal);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(luckyNumbers(arr));
    }
}


// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.