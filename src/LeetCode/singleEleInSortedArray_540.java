package LeetCode;

public class singleEleInSortedArray_540 {
    public static int singleElement(int[] arr) {
        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;
            if (mid % 2 == 1){
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                st = mid + 2;
            } else {
                end = mid;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};

        System.out.println(singleElement(arr));
    }
}
