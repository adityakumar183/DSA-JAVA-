package Sorting;

public class stringSort {
    public static void sortfruit(String[] s){
        int n = s.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(s[j].compareTo(s[min_index])<0){
                    min_index = j;
                }
            }
            // swap of main index and fruit of ith index
            String temp = s[i];
            s[i] = s[min_index];
            s[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "papaya","kiwi","mango","apple"};
        sortfruit(fruits);
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }
    }
}
