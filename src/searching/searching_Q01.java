package searching;
/*
     Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence
     of x is found then return -1.
     Input
     arr = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
     x=5

    Output 1
    1

 */
public class searching_Q01 {
    public static int firstoccurence(int[] arr , int target) {
        int n = arr.length;
        int st = 0, end = n-1;
        int fo = -1;
        while (st <= end) {
            int mid = st + (end-st)/2;
            if (arr[mid] == target) {
                fo = mid;
                end = mid-1;       // for last recurrence , end ke place pe st kar do or - ke place pe +
            }
            else if (arr[mid] < target) {
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,5,5,6,6,8,9,9,9};
        int target = 5;

        System.out.print(firstoccurence(arr,target));
    }
}
