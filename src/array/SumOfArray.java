package array;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={22,23,12,25,54,56,67,78,98,45,36,45,78,90,33,22,43,35,55,66,74,13,11,1};
        int n=arr.length;
        int sum=0;

        for (int i = 0; i < n; i++) {
            sum=sum + arr[i];
        }
        System.out.print("sum is : " + sum);
    }
}
