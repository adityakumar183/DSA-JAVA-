package array;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr={22,23,12,25,54,56,67,78,98,45,36,45,78,90,33,22,43,35,55,66,74,13,11,1};
        int n=arr.length;
        int mx=arr[0];

 //        int mx= Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if(mx<=arr[i]) mx=arr[i];
//        mx=Math.max(mx,arr[i]);
        }

        int smx=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] != mx)
                smx=Math.max(smx,arr[i]);
        }
        System.out.println("maximum value of array is : " + mx);
        System.out.print("2nd maximum value is : " + smx);
    }
}
