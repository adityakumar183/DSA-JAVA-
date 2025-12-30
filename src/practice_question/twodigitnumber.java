package practice_question;

import java.util.Scanner;

public class twodigitnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int x= sc.nextInt();

        if (x>9 && x<100){
            System.out.println(x+ " is a 2 digit number");
        }else{
            System.out.println(x+" is not 2 digit number.");
        }

    }
}
