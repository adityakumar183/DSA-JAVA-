package array;

import java.util.Arrays;

public class BuiltInMethod {
    public static void main(String[] args) {
        int [] arr={ 23,34,65,10,67,63,58};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        // for each loop:-

//        for(int ele : arr){             // ye ek alag method hai array ke element ko print karne ka
//            System.out.print(ele + " ");
//        }


        System.out.println();
        Arrays.sort(arr);                          // built in function ya method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
