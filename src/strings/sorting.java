package strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "aditya";
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        StringBuffer sb = new StringBuffer("kumar");
        char [] ch1 = sb.toString().toCharArray();
        Arrays.sort(ch1);
        for(char ele : ch1){
            System.out.print(ele);
        }
    }
}
