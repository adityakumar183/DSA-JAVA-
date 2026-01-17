package recursion;

import java.util.Scanner;

public class printNaturalNumberBack {
    public static void printDecreasing(int n){
        // base case:-
        if(n==1){
            System.out.println(1);
            return;
        }

        // self work:-
        System.out.println(n);

        // recursive work :-
        printDecreasing(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();

        printDecreasing(n);
    }
}
