package recursion;

import java.util.Scanner;

public class sumOfDigit {
    public static int digitsum(int n){
        // base case :-
        if(n%10==n) return n;
        // recursive work :- find (n/10)
        // self work :- sum last digit
        return digitsum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        System.out.println("sum of digit of " + n + " is: " + digitsum(n));
    }
}
