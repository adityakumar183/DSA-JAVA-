package Conditionals;

import java.util.Scanner;

public class rectangleareaandperimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter length : ");
        int l=sc.nextInt();
        System.out.print(" enter breath : ");
        int b=sc.nextInt();

        int area=l*b;
        System.out.println("area of rectangle : "+area);
        int perimeter = 2*(l+b);
        System.out.println("perimeter of rectangle :"+ perimeter);

        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }else{
            System.out.println("perimeter is greater than area");
        }

    }
}
