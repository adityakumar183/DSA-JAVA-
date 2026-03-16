package searching;
/*
       A peak element is an element that is strictly greater than its neighbors.

       Given a 0-indexed integer array nums, find a peak element, and return its index. If
       the array contains multiple peaks, return the index to any of the peaks.

       You may imagine that nums[-1] = nums[n] = -m. In other words, an element is
       always considered to be strictly greater than a neighbor that is outside the array.

       Youjmust write an algorithm that runs in 0(log n) time.
 */
public class searching_Q08 {
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n-1 || arr[mid] > arr[mid + 1])){
                return mid;
            }
            else if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(arr));
    }
}
