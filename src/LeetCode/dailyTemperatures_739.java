package LeetCode;
import java.util.Stack;

public class dailyTemperatures_739 {
    public static int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (st.size() > 0  && arr[i] > arr[st.peek()]) {
                int idx = st.pop();
                res[idx] = i - idx;
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}



/*
    Given an array of integers temperatures represents the daily temperatures,
    return an array answer such that answer[i] is the number of days you have
    to wait after the ith day to get a warmer temperature. If there is no
    future day for which this is possible, keep answer[i] == 0 instead.

    Example 1:
    Input: temperatures = [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]
 */