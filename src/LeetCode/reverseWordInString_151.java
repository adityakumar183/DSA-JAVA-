package LeetCode;
import java.util.Scanner;

public class reverseWordInString_151 {
    public static String reverseWords(String s) {
        s = s.trim();

        // Split by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the array of words
        int i = 0, j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        // Join back with single space
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = reverseWords(input);
        System.out.println(result);
    }

}
