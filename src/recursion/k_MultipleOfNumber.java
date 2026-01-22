package recursion;

import java.util.Scanner;

public class k_MultipleOfNumber {
    public static void multiple(int n , int k){
        if(k==1){                  // if( k == 0 )  return ;
            System.out.println(n);
            return;
        }
        multiple(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter n : ");
        int k = sc.nextInt();

        multiple(n , k);
    }
}
