package PatternPrinting;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter rows & columns : ");
        int m=sc.nextInt();
        int n=sc.nextInt();

        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
