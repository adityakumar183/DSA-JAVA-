package strings;

import java.util.Scanner;
public class ToggleChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        int n=sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){  // capital letter
                ascii +=32;
            }
            else if(ascii>=97 && ascii<=123){  // small letter
                ascii -=32;
            }
            ch = (char)ascii;
            sb.setCharAt(i , ch);
        }
        System.out.println(sb);
    }
}
