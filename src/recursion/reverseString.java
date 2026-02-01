package recursion;
import java.util.Scanner;
public class reverseString {

//    public static String reverseusingidx(String s , int idx){
//        if(idx == s.length()){
//            return "";
//        }
//        String smallans = reverseusingidx(s,idx+1);
//        return smallans + s.charAt(idx);
//    }
    public static String reverse(String s){
        // base case:-
        if(s.length()==0){
            return "";
        }
        // recursive case:-
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(reverse(s));
//        System.out.println(reverseusingidx(s,0));
    }
}
