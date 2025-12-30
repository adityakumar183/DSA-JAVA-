package Function;

import java.util.Scanner;

public class PrintMyName {
    public static void printname(String name) {
        System.out.print(" your name is : ");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name=sc.next();

        printname(name);
    }
}
