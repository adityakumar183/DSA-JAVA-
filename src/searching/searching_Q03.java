package searching;
/*
      A rotated sorted array is a sorted array on which rotation operation has been performed some
      number of times. Given a rotated sorted array, find the index of the minimum element in the array.
      Follow 0-based indexing.
      It is guaranteed that all the elements in the array are unique.
      Input :
      Array = [3, 4, 5, 1, 2]

      Output :
      3
 */

public class searching_Q03 {
    public static int findmin(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]>=arr[n-1]){
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,1,2,3};

        System.out.println(findmin(arr));
    }
}
