package strings;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
     //   String str = sc.next();     // next sirf ek single word consider karta hai
        String st = sc.nextLine();   // next line karne se pura para consider kiya jata hai
        String s = "Hii ";
        System.out.print(s);
        //   System.out.println(str);
        System.out.print(st);
    }
}
