package PatternPrinting;

import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter n : ");
            int n= sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
     //               System.out.print((char)(i+64) +" ");   // A A A A   B B B B    C C C C .....
     //               System.out.print((char)(j+64)+" ");   //  A B C D   A B C D    A B C D .....
                      System.out.print((char)(j+96)+ " "); //   a b c d   a b c d    a b c d .....
                }
                System.out.println();
            }
        }
    }

