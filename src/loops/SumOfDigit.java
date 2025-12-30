package loops;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();

        int sum=0;
        while(n!=0){
//            int ld=n%10;
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);



    }
}
