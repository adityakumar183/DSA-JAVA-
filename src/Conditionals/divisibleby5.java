package Conditionals;

import java.util.Scanner;

public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        if (x%5==0){
            System.out.println("divisible by 5");
        } else{
            System.out.println("not divisible by 5");
        }

    }
}
