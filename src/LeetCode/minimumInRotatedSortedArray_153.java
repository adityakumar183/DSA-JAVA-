package LeetCode;

public class minimumInRotatedSortedArray_153 {
    public static int findMin(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int mid = (st + end) / 2;

            if (arr[mid] > arr[end]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(findMin(arr));
    }
}
