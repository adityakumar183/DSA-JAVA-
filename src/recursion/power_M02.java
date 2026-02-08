package recursion;

import java.util.Scanner;

public class power_M02 {
    public static double power(double p , int q){
        // base case:-
        if(q==0) return 1;
        if(q<0) return 1/power(p,-q); // for negative power

        double temp = power(p , q/2);
        if(q%2==0){
            return temp * temp;                     // for even q
        }
        return p * temp * temp;                      // for odd q
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base : ");
        double p = sc .nextDouble();
        System.out.print("enter power : ");
        int q = sc.nextInt();

        System.out.println("value of " + p + "^" + q +"= " + power(p,q));
    }
}
