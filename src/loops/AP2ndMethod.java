package loops;

import java.util.Scanner;

public class AP2ndMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n= sc.nextInt();

        // 4 2 0 -2 -4 -6 -8............

        int a = 4 , d = -2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a += d;
        }
    }
}
