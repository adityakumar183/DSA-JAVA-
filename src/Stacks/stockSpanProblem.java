package Stacks;
import java.util.*;

public class stockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;
        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.size()==0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}

/*
// Question:- Given a series of N daily price quotes for a stock, we need to calculate the span of the stock's price for all N
              days. The span of the stock's price in one day is the maximum number of consecutive days (starting from that day
              and going backward) for which the stock price was less than or equal to the price of that day.


// Stock span problem ka solution previous greater element method pe kaam karta hai

 */