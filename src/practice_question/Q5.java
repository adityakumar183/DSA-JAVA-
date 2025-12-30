package practice_question;
// Q5. Write a Java program to calculate the area of a circle and the simple interest. Take necessary inputs
//     from the user.
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius: ");
        double r=sc.nextDouble();
        System.out.println("Area of circle="+(3.14*r*r));
        System.out.print("enter principal value: ");
        int x=sc.nextInt();
        System.out.print("enter rate: ");
        int p=sc.nextInt();
        System.out.print("enter time: ");
        int t=sc.nextInt();
        double si=(x*p*t)/100;
        System.out.println("simple interest = "+si);
        System.out.println("total amount ="+(x+si));
    }
}
