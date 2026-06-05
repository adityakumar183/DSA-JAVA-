package LeetCode;

public class countNegativeNumberInASortedMatrix_1351 {
    public static int countNegatives(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;

        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (arr[row][col] < 0) {
                // iss column ke niche sare negative element hai
                count = count + (m - row);
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println("Number of negative element : " + countNegatives(arr));
    }
}
