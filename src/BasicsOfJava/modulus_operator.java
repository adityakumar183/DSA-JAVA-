package BasicsOfJava;
import java.util.Scanner;
public class modulus_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter divisior: ");
        int x=sc.nextInt();
        System.out.print("enter dividend : ");
        int y=sc.nextInt();
        int q=y/x;
        System.out.println("quotient is : " +q);
        int z=y%x;
        System.out.print("modulus is: "+z);
    }
}
