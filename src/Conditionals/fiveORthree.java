package Conditionals;

import java.util.Scanner;

public class fiveORthree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number :");
        int x= sc.nextInt();

        if(x%5==0 || x%3==0){
            System.out.println("number is divisible by 3 or 5");
        }else{
            System.out.println("number is not divisible by 3 or 5");
        }

    }
}
