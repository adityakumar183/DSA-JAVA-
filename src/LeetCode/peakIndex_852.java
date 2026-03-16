package LeetCode;

public class peakIndex_852 {
    public static int peakIndex(int [] arr){
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
        int[] arr = {2,4,7,10,6,4,3,1,0};
        int peakindex = peakIndex(arr);
        System.out.println("peak index : " + peakindex);
        System.out.println("peak element  : " + arr[peakindex]);
    }
}
