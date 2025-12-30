package array;

public class ProductOfArray {
    public static void main(String[] args) {
        int [] arr={22,23,12,25};
        int n=arr.length;
        int product=1;

        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.print("product of " + n + " array is :" + product);
    }
}
