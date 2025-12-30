package array;

import java.util.Arrays;

public class CopyArray {
    static void printarray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr_1={23,24,26,32,43,56,78};
        System.out.print("original array : ");
        printarray(arr_1);


        // trying to copy array
        int [] arr_2=arr_1;
        System.out.print("copied array : ");
         printarray(arr_2);

         // trying to change some values
        arr_2[0]=1;
        arr_2[1]=2;
        System.out.print("changed array : ");
        printarray(arr_2);


         // cloning of array
        int [] arr_3=arr_1.clone();
        System.out.print("cloned array : ");
        printarray(arr_3);


        int [] arr_4= Arrays.copyOf(arr_1,arr_1.length);
        System.out.print("copy : ");
        printarray(arr_1);

    }
}
