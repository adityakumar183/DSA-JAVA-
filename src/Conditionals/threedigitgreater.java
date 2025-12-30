package Conditionals;

import java.util.Scanner;

public class threedigitgreater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st digit :");
        int x=sc.nextInt();
        System.out.print("enter 2nd digit :");
        int y=sc.nextInt();
        System.out.print("enter 3rd digit :");
        int z=sc.nextInt();

        if(x>=y && x>=z){
            System.out.println(x+ " is greater");
        } else if (y>=x && y>=z) {
            System.out.println(y+ " is greater");
        }else if (z>=x && z>=y){
            System.out.println(z+ " is greater");
        }else {
            System.out.println("not a valid number entered");
        }
    }
}
