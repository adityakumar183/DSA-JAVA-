package array;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr= {23,45,35,46,84,10,56};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // shallow copy
        int[] brr=arr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        brr[0]=10;
        brr[1]=23;
        System.out.println(brr[0]+" "+brr[1]);
        System.out.println(arr[0]+ " "+ arr[1]);

        // deep copy
        int [] crr= Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(crr[i]+ " ");
        }
        System.out.println();

        crr[1]=1;
        crr[2]=2;
        System.out.println(crr[1]+" "+crr[2]);
        System.out.println(arr[1]+ " "+ arr[2]);

    }
}
