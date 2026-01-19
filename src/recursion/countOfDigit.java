package recursion;

import java.util.Scanner;

public class countOfDigit {
    public static int digitcount(int n){
        // base case :-
        if(n%10==n) return 1;
       // if(n>=0 && n<=9) return 1;

        // recursive case :- find (d-1)th digit count
        // self work :- add 1
        return digitcount(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n = sc.nextInt();

        System.out.println("number of digit = "+ digitcount(n));
    }
}
