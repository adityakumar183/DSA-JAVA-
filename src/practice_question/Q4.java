package practice_question;
// Q4. Write a Java program that demonstrates the use of increment (++), decrement (--), and modulus (%)
//     operators. Print the results.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter 1st number : ");
        int x=sc.nextInt();
        System.out.print("enter 2nd number : ");
        int y=sc.nextInt();
        System.out.println("entered value : "+x+","+y);
        x++;
        y++;
        System.out.println("increment value :"+x+ ","+y );
      //  x=x-2;      iska use tab karenge jab given value qko 1 se kum karna hoga.
        x--;
        y--;
        System.out.println("decrement value : " +x+ ","+y);
        System.out.println("modulus value : "+(x%y));
    }
}
