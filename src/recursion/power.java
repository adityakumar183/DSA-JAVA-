package recursion;

import java.util.Scanner;

public class power {
    public static int power(int p , int q){
        // base case:-
        if(q==0) return 1;
        // recursive work :- find p^(q-1)
        // self work :- multiply with p
        return p * power(p ,q-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base : ");
        int p = sc .nextInt();
        System.out.print("enter power : ");
        int q = sc.nextInt();

        System.out.println("value of " + p + "^" + q +"=" + power(p,q));
    }
}
