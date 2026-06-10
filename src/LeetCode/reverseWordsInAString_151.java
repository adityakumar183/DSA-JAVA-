package LeetCode;

public class reverseWordsInAString_151 {
    public static String reverseWordOrder(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "  hello world  ";
        String output = reverseWordOrder(input);
        System.out.println(output);
    }
}
