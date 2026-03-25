package LeetCode;

public class findDuplicateNumber_287 {
    public static int findDuplicate(int[] arr) {
        int low = 1;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : arr) {
                if (num <= mid) count++;
            }
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        System.out.println(findDuplicate(arr));
    }
}
