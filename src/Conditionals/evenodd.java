package Conditionals;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else
            System.out.println("odd number");
    }
}
