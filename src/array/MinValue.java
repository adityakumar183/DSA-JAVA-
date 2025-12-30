package array;

public class MinValue {
    public static void main(String[] args) {
        int [] arr={22,23,45,23,56,35,26,34,1,-1,56,77};
        int n= arr.length;
        int min=arr[0];

        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print(" minimum value is : "+ min);
    }
}
