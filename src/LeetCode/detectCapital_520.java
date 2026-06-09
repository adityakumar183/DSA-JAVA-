package LeetCode;

public class detectCapital_520 {
    public static boolean detectCapitalUse(String s) {
        int n = s.length();
        boolean allUpper = true;
        boolean allLower = true;

        // Check each character's ASCII value
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int ascii = (int) c;

            if (ascii >= 65 && ascii <= 90) {
                allLower = false;
            } else if (ascii >= 97 && ascii <= 122) {
                allUpper = false;
            }
        }

        // Case 1: all uppercase
        if (allUpper) return true;

        // Case 2: all lowercase
        if (allLower) return true;

        // case 03:- first uppercase, rest lowercase
        char first = s.charAt(0);
        int firstAscii = (int) first;
        if (firstAscii >= 65 && firstAscii <= 90) {
            for (int i = 1; i < n; i++) {
                int ascii = (int) s.charAt(i);
                if (!(ascii >= 97 && ascii <= 122)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("LeetCode"));
        System.out.println(detectCapitalUse("computer"));
    }
}
