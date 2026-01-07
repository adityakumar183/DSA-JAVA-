package strings;

public class StringBuilderInJava {
    public static void main(String[] args) {
        String s = "Aditya";
        StringBuilder sb =new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder x = new StringBuilder("");    // sirf () ye ho skta hai
        System.out.println(x.length());
        System.out.println(x.capacity());

        StringBuilder a = new StringBuilder(10);
        System.out.println(a.capacity());

    }
}
