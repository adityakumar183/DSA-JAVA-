package Sorting;
/*     A college stores the roll numbers of students in random order.
       The administration wants to arrange these roll numbers in ascending
       order so that searching and record management becomes easier.
 */
public class sorting_Q4 {
        public static void main(String args[]) {

            int arr[] = {45, 12, 78, 34, 23};
            int n = arr.length;

            for(int i = 0; i < n-1; i++) {

                int minIndex = i;

                for(int j = i+1; j < n; j++) {

                    if(arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }

                }

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Sorted Roll Numbers:");

            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
