package strings;
import java.util.Scanner;
public class ConvertIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();

      //  String s = "" + x ;
        String s = Integer.toString(x);   // built in function for converting int to string
        System.out.println(s);
        System.out.println(s.length());
    }
}
