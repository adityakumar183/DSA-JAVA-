package BasicsOfJava;

import java.util.Scanner;
public class half_of_given_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
//        int x=sc.nextInt();
//        double y=(double)x;
//        System.out.println("half of given number: "+y/2);
        double y =sc.nextDouble();
        int x=(int)y;
        System.out.println("integer number: "+x);
    }
}
