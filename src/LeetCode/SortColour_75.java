package LeetCode;

public class SortColour_75 {
    public static void main(String[] args) {
        int [] arr= {1,2,0,1,2,0,0,1,2,0,2,1,0};
        int n=arr.length;

        // Dutch flag algorithm  (one pass method)   isme hum swap ka function v bna sakte hai.
        int mid=0,low=0,hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else{  // arr[mid]==2
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
