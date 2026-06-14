package LeetCode;
import java.util.*;

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
     Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

     Implement the MinStack class:
        - MinStack() initializes the stack object.
        - void push(int value) pushes the element value onto the stack.
        - void pop() removes the element on the top of the stack.
        - int top() gets the top element of the stack.
        - int getMin() retrieves the minimum element in the stack.

    You must implement a solution with O(1) time complexity for each function.
 */