package array;
import java.util.Scanner;
public class uniqueNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("enter " + i + " element : ");
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println("Unique number is: " + arr[i]);
                }
            }
        }
    }
