package searching;
/*
            Search element in rotated sorted array with duplicate elements. Return true if the element is found,
            else return false.
            Input :
            [0,0,0,1,1,1,2,0,0,0], target = 2

            Output :
            true
 */
public class searching_Q05 {
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
        int[] arr ={0,0,0,1,1,1,2,0,0,0};
        int target = 2;

        System.out.print(search(arr,target));
    }
}
