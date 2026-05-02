package LeetCode;

public class findTheDifference_389 {
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;   // cancel out characters from s
        }
        for (char c : t.toCharArray()) {
            result ^= c;   // only extra char remains
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abc";
        System.out.println(findTheDifference(s,t));
    }
}
