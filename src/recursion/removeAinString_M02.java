package recursion;
import java.util.Scanner;
public class removeAinString_M02 {         // without using index:-
    public static String remove(String s){
        // base case:-
        if(s.length() == 0){
            return "";
        }

        //recursive case:-
        String smallans = remove(s.substring(1));

        //self work:-
        if(s.charAt(0) != 'a'){
            return s.charAt(0) + smallans;
        }else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(remove(s));
    }
}
