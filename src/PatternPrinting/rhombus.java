package PatternPrinting;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n : ");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
//                System.out.print(j+" ");
//                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}


