package searching;

public class searching_07 {
    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            boolean leftOK = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean rightOK = (mid == arr.length - 1) || (arr[mid] >= arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid; // Found peak index
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                // Else move right
                low = mid + 1;
            }
        }
        return -1; // Should never reach here if array has at least one element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element is " + arr[peakIndex] + " at index " + peakIndex);
    }
}
