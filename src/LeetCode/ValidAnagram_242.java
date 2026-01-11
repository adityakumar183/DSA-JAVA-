package LeetCode;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean flag = false;

        if(s.length()!=t.length()){
            flag=false;
        }else {
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    flag=false;
                }else  {
                    flag=true;
                }
            }
//            if(Arrays.equals(a,b)){     // built in function in array..
//                flag=true;
//            }
        }
        System.out.println(flag);
    }
}
