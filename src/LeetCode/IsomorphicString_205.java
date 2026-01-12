package LeetCode;

public class IsomorphicString_205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = new char[128];
        char[] b = new char[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);

            if (a[ch] == '\0' && b[dh] == '\0') {
                // create new mapping
                a[ch] = dh;
                b[dh] = ch;
            } else {
                // check consistency
                if (a[ch] != dh || b[dh] != ch) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if (isIsomorphic(s, t)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}




