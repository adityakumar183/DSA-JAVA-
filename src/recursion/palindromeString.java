package recursion;
import java.util.Scanner;
public class palindromeString {
    public static String reverseusingidx(String s , int idx){
        // base case:-
        if(idx == s.length()){
            return "";
        }
        // recursive work:-
        String smallans = reverseusingidx(s,idx+1);
        // self work:-
        return smallans + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev =  reverseusingidx(s,0);
        if(rev.equals(s)){
            System.out.printf("%s is a palindrome",s);
        }else{
            System.out.printf("%s is not a palindrome",s);
        }
    }
}

// printf ka use kar ke hum %s v use kar sakte hai.