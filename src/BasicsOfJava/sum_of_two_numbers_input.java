package BasicsOfJava;

import java.util.Scanner;

public class sum_of_two_numbers_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("sum of two numbers : ");
        System.out.println(a+b);
    }
}
