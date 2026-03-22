package LeetCode;

import com.sun.jdi.PathSearchingVirtualMachine;

public class searchInRotatedSortedArrayII_81 {
    public static boolean search(int[] arr, int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return true;
            }
            // Handle duplicates: shrink the search space
            else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
            }
            // Left half is sorted
            else if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
}
