package recursion;

import java.util.Scanner;

public class power_M02 {
    public static int power(int p , int q){
        // base case:-
        if(q==0) return 1;

        int temp = power(p , q/2);
        if(q%2==0){
            return temp * temp;                     // for even q
        }
        return p * temp * temp;                      // for odd q
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base : ");
        int p = sc .nextInt();
        System.out.print("enter power : ");
        int q = sc.nextInt();

        System.out.println("value of " + p + "^" + q +"= " + power(p,q));
    }
}
