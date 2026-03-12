package LeetCode;

public class firstAndLastOcc_34 {
    public static int[] FirstAndLastOcc(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int first = -1, last = -1;

        // First occurrence
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1; // keep searching left
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Reset boundaries for last occurrence
        st = 0;
        end = n - 1;

        // Last occurrence
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                last = mid;
                st = mid + 1; // keep searching right
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;

        int[] result = FirstAndLastOcc(arr, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }


}
