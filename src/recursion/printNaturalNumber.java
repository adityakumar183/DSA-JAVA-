package recursion;

import java.util.Scanner;

public class printNaturalNumber {
    public static void printnumber(int n){
        // base case:-
        if(n==1){
            System.out.println(n);
            return;
        }

        // recursive work:_
        printnumber(n-1);

        // self work:-
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter n : ");
        int n= sc.nextInt();

        printnumber(n);
    }
}
