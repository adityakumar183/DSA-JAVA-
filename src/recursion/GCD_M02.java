package recursion;

import java.util.Scanner;

public class GCD_M02 {
    public static int GCD(int x,int y){
        if(y==0) return x;
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("GCD is : " + GCD(x,y));
        int LCM = (x*y)/GCD(x,y);
        System.out.println("LCM is : " + LCM);
    }
}
