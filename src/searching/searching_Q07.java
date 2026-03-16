package searching;
/*
       Given a mountain array 'a' of length greater than 3, return the index 'i' such that arr[0] <arr[1] <... <arr[i - 1]
       < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]. This index is known as the peak index.
       Input :
       Array = [0,4,1,0]

       Output :
       1
 */

public class searching_Q07 {
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element is " + arr[peakIndex] + " at index " + peakIndex);
    }
}
