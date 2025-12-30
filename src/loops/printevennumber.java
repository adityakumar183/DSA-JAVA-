package loops;

import java.util.Scanner;

public class printevennumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
    }
}
