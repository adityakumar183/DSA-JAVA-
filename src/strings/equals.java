package strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String p = "abc";
        p = p + "xyz";
        System.out.println(s==a);  // true   (due to address same)
        System.out.println(s==b);  // false  (due to different string)
        System.out.println(s==p);   // false (due to address change)

        System.out.println(s.equals(a));     // true
        System.out.println(s.equals(b));    // true (string comparison)
        System.out.println(s.equals(p));   // true  (because string compare)
    }
}
