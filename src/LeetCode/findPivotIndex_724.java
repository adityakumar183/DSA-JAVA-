package LeetCode;

public class findPivotIndex_724 {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prefixSum == total - prefixSum - nums[i]) {
                return i;
            }
            prefixSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
}



/*
      The pivot index is the index where the sum of all the numbers strictly to the left of
      the index is equal to the sum of all the numbers strictly to the index's right.
 */
