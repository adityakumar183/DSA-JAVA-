package LeetCode;

public class reverseString_344 {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        System.out.println(ch);
        reverseString(ch);
        System.out.println(ch);
    }
}
