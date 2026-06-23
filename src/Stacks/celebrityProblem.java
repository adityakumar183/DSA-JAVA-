package Stacks;
import java.util.Stack;

public class celebrityProblem {
    public static int celebrity(int m[][]) {
        int n = m.length;

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            st.push(i);
        }

        while(st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if(m[v1][v2] == 0) {
                st.push(v1);
            } else if(m[v2][v1] == 0) {
                st.push(v2);
            }
        }

        if(st.size() == 0) return -1;
        int potential = st.pop();

        // check row of potential
        for(int j = 0; j < n; j++) {
            if(m[potential][j] == 1 && j != potential) return -1;
        }

        // check column of potential
        for(int i = 0; i < n; i++) {
            if(i == potential) continue;
            if(m[i][potential] == 0) return -1;
        }
        return potential;
    }

    public static void main(String[] args) {
        int[][] matrics = {
                {1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}
        };
        System.out.println(celebrity(matrics));
    }
}


/*
     A celebrity is a person who is known to all but does not know anyone at a party.
     A party is being organized by some people. A square matrix mat[][] of size n*n is
     used to represent people at the party such that if an element of row i and column j
     is set to 1 it means ith person knows jth person. You need to return the index of
     the celebrity in the party, if the celebrity does not exist, return -1.

     Note: Follow 0-based indexing.

     Examples:
       Input: mat[][] = [[1, 1, 0],
                      [0, 1, 0],
                     [0, 1, 1]]
      Output: 1
     Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone.
     Therefore, 1 is the celebrity person.
 */
