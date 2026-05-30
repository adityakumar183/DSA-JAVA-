package LeetCode;
import java.util.*;

public class findAllNumbersDisappearedInAnArray_448 {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];      // negative mark karne ke liye (-) iska use ho raha hai
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
