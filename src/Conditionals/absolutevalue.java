package Conditionals;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter a number = ");
        int x = sc.nextInt();

        if (x<0){
            System.out.println(" absolute value= "+(-x));
        }else{
            System.out.println(" absolute value = "+ x);
        }
    }
}
