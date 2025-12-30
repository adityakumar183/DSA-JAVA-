package Conditionals;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter cost price : ");
        int cp= sc.nextInt();
        System.out.print("enter selling price : ");
        int sp = sc.nextInt();

        if(cp<sp){
            System.out.println(" profit is " +(sp-cp));
        }
        else if(cp>sp){
            System.out.println(" loss is "+(cp-sp));
        }
        else{
            System.out.println(" no profit no loss");
        }
    }
}
