package loops;

import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
            System.out.print(i+" ");  // in horizontal line
        }
    }
}
