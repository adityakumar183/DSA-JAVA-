package strings;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aditya");
        System.out.println(sb);

        sb.append(35);
        System.out.println(sb);

        sb.append("*");
        System.out.println(sb);

        sb.append("kumar");
        System.out.println(sb);

        char[] ch = {'a', 'd', 'i'};
        sb.append(ch);
        System.out.println(sb);

//        int[] arr = {1,2,3,4,5};
//        sb.append(arr);      // does not work   address is appended
//        System.out.println(sb);

        StringBuilder t = new StringBuilder("xyz");
        sb.append(t);
        System.out.println(sb);

        //  sb += " qwe";  // not possible in stringbuilder
    }
}
