package strings;

public class InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aditya Kumar");
        System.out.println(sb);

        sb.deleteCharAt(6);
        System.out.println(sb);

        System.out.println(sb.charAt(6));

        sb.setCharAt(6, 'x');
        System.out.println(sb);

        sb.delete(5,7);
        System.out.println(sb);

        sb.insert(5, "a k");
        System.out.println(sb);

        sb.insert(0,"Mr.");
        System.out.println(sb);

        sb.insert(15,183);
        System.out.println(sb);
    }
}