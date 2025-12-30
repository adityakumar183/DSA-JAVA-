package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();

        // 3 9 27 81 243 ..........

        int a=3,r=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
