package LeetCode;

public class rotateString_796 {
    public static boolean rotateString(String s, String goal) {
        // Base Case:
        if (s.length() != goal.length()) return false;

        String doubled = s + s;

        // Check if goal is a substring of doubled
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
