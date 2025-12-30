package Function;

import java.util.Scanner;

public class SumOfTwoNumber {
   public static int sum(int a, int b){
       System.out.print("sum is : ");
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a : ");
        int a=sc.nextInt();
        System.out.print("enter b : ");
        int b=sc.nextInt();

      int sum = sum(a , b);
        System.out.print(sum);

    }
}
