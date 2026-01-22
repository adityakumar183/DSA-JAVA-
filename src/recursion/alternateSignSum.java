package recursion;

import java.util.Scanner;

public class alternateSignSum {
    public static int sum(int n){
        // base case :-
        if(n==0){
            return 0;
        }

        // subproblem :-
        int value=sum(n-1);

        // self work :-
        if(n%2==0){
            return value-n;
        }
        return value+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
