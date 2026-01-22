package recursion;

import java.util.Scanner;

public class n_MultipleOfNumber {
    public static void multiple(int x , int n){
        if(n==1){
            System.out.println(x);
            return;
        }
        multiple(x,n-1);
        System.out.println(x*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int x = sc.nextInt();
        System.out.print("enter n : ");
        int n = sc.nextInt();

        multiple(x , n);
    }
}
