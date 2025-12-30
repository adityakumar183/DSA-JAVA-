package BasicsOfJava;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter a char: ");
        char ch=sc.next().charAt(0);
        System.out.print("you entered: "+(int)ch);
    }
}
