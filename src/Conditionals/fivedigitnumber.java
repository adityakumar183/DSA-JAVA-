package Conditionals;

import java.util.Scanner;

public class fivedigitnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter a number: ");
        int x = sc.nextInt();

        if(x>9999 && x<100000){
            System.out.println("five digit number");
        }else{
            System.out.println("not a five digit number");
        }
    }
}
