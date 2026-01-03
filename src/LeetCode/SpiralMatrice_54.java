package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrice_54 {
    public static void main(String[] args) {
        // array given rahega
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = arr.length;
        int n = arr[0].length;

        // spiral
        List<Integer> ans= new ArrayList<>();
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            // left to right
            for (int j = minc; j <= maxc; j++) {
                ans.add(arr[minr][j]);
            }minr++;
            if(minr>maxr || minc>maxc) break;
            // top to bottom
            for (int i = minr; i <= maxr; i++) {
               ans.add(arr[i][maxc]);
            }maxc--;
            if(minr>maxr || minc>maxc) break;
            // right to left
            for (int j = maxc; j >= minc; j--) {
               ans.add(arr[maxr][j]);
            }maxr--;
            if(minr>maxr || minc>maxc) break;
            // bottom to top
            for (int i = maxr; i >= minr; i--) {
               ans.add(arr[i][minc]);
            }minc++;
        }
      //  return ans;
    }
}
