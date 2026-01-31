package recursion;
import java.util.Scanner;
public class removeAinString_M01 {
    public static String remove(String s, int idx){
        // base case:-
        if(idx == s.length()){
            return "";
        }

        // recursive work:-
        String smallans = remove(s, idx+1);

        // self work:-
        if(s.charAt(idx) != 'a'){
            return s.charAt(idx) + smallans;
        }else{
            return smallans;
        }

        // another method for self work:-
//        char currChar = s.charAt(idx);
//        if(currChar != 'a'){
//            return currChar + smallans;
//        }else {
//            return smallans;
//        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(remove(s,0));
    }
}
