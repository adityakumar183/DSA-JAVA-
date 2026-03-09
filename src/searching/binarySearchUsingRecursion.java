package searching;

public class binarySearchUsingRecursion {
    public static boolean binarysearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return binarysearch(arr, mid + 1, high, target);
        } else if (arr[mid] > target) {
            return binarysearch(arr, low, mid - 1, target);
        }
             return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int target = 0;
        while(target != 10){
            System.out.printf("%d exist in array : %b \n", target, binarysearch(arr, 0, n-1, target));
            target ++;
        }
    }
}
