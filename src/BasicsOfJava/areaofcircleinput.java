package BasicsOfJava;

import java.util.Scanner;

public class areaofcircleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle : ");
        double r=sc.nextDouble();
     //   double a=3.14*r*r;
        System.out.print("area of circle is : ");
        System.out.println(3.14*r*r);
     //   System.out.println(a);
    }
}
