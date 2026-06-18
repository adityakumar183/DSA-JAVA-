/*
     Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

     Implement the MinStack class:
        - MinStack() initializes the stack object.
        - void push(int value) pushes the element value onto the stack.
        - void pop() removes the element on the top of the stack.
        - int top() gets the top element of the stack.
        - int getMin() retrieves the minimum element in the stack.

    You must implement a solution with O(1) time complexity for each function.
 */

package LeetCode;
import java.util.*;

// Method 01:-
public class minStack_155 {
    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public  minStack_155() {       // constructor
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    public void pop() {
        int removed = st.pop();
        if (removed == minSt.peek()) {
            minSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }

    public static void main(String[] args) {
        minStack_155 minStack = new minStack_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top());    // 0
        System.out.println(minStack.getMin()); // -2
    }
}


/*
// Method 02:-

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
 */


/*
// Method 03:-   T.C = O(1)
class MinStack {
    Stack<Long> st = new Stack<>();
    long min;

    public MinStack() {
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long x = (long)val;
        if(st.size()==0){
            st.push(x);
            min = x;
        }
        else if(x>=min){
            st.push(x);
        }
        else{    // x<min
            st.push(2*x-min);
            min = x;
        }
    }

    public void pop() {
        if(st.size()==0) return;
        else if(st.peek()>=min){
            st.pop();
        }
        else {        //st.peek()<min
            long old = 2*min - st.peek();
            min = old;
            st.pop();
        }
    }

    public int top() {
        if(st.size()==0) return -1;
        long top = st.peek();
        if(top>=min) return (int)top;
        else return (int)min;
    }

    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
    }
}
 */