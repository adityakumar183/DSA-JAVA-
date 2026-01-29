package array;

import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("arrays are :-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
