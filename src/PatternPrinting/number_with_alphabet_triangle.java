package PatternPrinting;

import java.util.Scanner;

public class number_with_alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print((char)(j+64)+" ");
                }
                System.out.println();
            }
        }
    }
}


