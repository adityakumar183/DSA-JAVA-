package Stacks;
import java.util.Stack;

public class slidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z =0;
        // Method 01:-   T.C = O(k*(n-k+1)) -> O(k*n)
        // for(int i=0;i<n-k+1;i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j = i;j<i+k;j++){
        //         max = Math.max(max,nums[j]);
        //     }
        //     ans[z++] = max;
        // }
        // return ans;

        // Method 02:-   Time Limit Exceeded
//        Stack<Integer> st = new Stack<>();
//        int[] nge = new int[n];
//        st.push(n-1);
//        nge[n-1] = n;
//        for(int i = n-2;i>=0;i--){
//            while(st.size()>0 && nums[st.peek()] < nums[i]){
//                st.pop();
//            }
//            if(st.size()==0) nge[i] = n;
//            else nge[i] = st.peek();
//            st.push(i);
//        }
//        for(int i = 0; i<n-k+1;i++){
//            int j = i;
//            int max = nums[j];
//            while(j<i+k){
//                max = nums[j];
//                j = nge[j];
//            }
//            ans[z++] = max;
//        }
//        return ans;

        // Method 03:-   just one change in method 02    (j ko loop ke bahar declear kiya or usko tabhi piche kiya jab wo out of window chala jaaye)
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i = n-2;i>=0;i--){
            while(st.size()>0 && nums[st.peek()] < nums[i]){
                st.pop();
            }
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        int j = 0;
        for(int i = 0; i<n-k+1;i++){
            if(j>=i+k) j = i;
            int max = nums[j];
            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}


/*
      You are given an array of integers nums, there is a sliding window of size k which is moving from the very
      left of the array to the very right. You can only see the k numbers in the window. Each time the sliding
      window moves right by one position.

      Return the max sliding window.

      Example 1:
        Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        Output: [3,3,5,5,6,7]
        Explanation:
        Window position                Max
        ---------------               -----
        [1  3  -1] -3  5  3  6  7       3
         1 [3  -1  -3] 5  3  6  7       3
         1  3 [-1  -3  5] 3  6  7       5
         1  3  -1 [-3  5  3] 6  7       5
         1  3  -1  -3 [5  3  6] 7       6
         1  3  -1  -3  5 [3  6  7]      7
 */