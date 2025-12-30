package _2D_Array;

public class SumAndProductOf2Darray {
    public static void main(String[] args) {
        int [][] arr={{3,2,4},{1,5,7},{6,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
        int product=1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
                product*=arr[i][j];
            }
        }
        System.out.println("sum is : "+sum);
        System.out.println("product is : "+product);
    }
}
