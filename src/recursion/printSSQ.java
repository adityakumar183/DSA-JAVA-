package recursion;
import java.util.Scanner;
public class printSSQ {
    public static void printSSQ(String s,String CurrAns){
        if(s.length()==0){
            System.out.println(CurrAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString,CurrAns+curr);
        printSSQ(remString,CurrAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string:- ");
        String s = sc.nextLine();

        printSSQ(s,"");
    }
}
