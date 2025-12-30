package Function;

import java.util.Scanner;

public class product {
    public static int product(int a ,int b) {
//        int product=a*b;
//        return product;
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a : ");
        int a=sc.nextInt();
        System.out.print("enter b : ");
        int b=sc.nextInt();

  //      int product=product(a,b);
  //      System.out.println(product);
        System.out.print("product of two number is : " +product(a,b));
    }
}
