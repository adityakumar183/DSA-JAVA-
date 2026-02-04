package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class returnSSQ {
    public static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case:-
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr =  s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));

        for(String small : smallans){
            ans.add(small);
            ans.add(curr+small);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> smallans = getSSQ(s);
        for(String small : smallans){
            System.out.println(small);
        }
     //   System.out.println(getSSQ(s));

    }
}
