package array;

import java.util.Arrays;

public class SortCharArray {
    public static void main(String[] args) {
        char[] ch = {'a', 'd', 'i', 't', 'y', 'a'};
        for(char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
