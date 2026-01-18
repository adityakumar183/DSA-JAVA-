package recursion;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        // base case:-
        if(n==0) return 1;
        // recursive work :- find factorial(n-1)
        // self work :-   n * factorial(n-1)
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        System.out.print("factorial of "+n +" = ");
        System.out.println(factorial(n));
    }
}
