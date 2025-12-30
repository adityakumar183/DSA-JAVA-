package BasicsOfJava;

import java.util.Scanner;

public class squareofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        System.out.print("Square of given number is : ");
        System.out.println(n*n);

    }
}
