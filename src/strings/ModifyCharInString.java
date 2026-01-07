package strings;

public class ModifyCharInString {
    public static void main(String[] args) {
        String s = "Aditya";
        System.out.println(s);
        // AdItya
        // 2nd index change in capital letter

        s = s.substring(0,2) + 'I' + s.substring(3);
        System.out.println(s);
    }
}
