package strings;

public class StringBuilderFunction {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Aditya");
        StringBuilder tb = new StringBuilder("Anand");
        System.out.println(sb.length());
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.isEmpty());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
        System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(2));
    }
}
