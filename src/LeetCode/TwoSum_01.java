package LeetCode;

public class TwoSum_01 {
    public static void main(String[] args) {
        int []arr={1,3,5,2,7,3,9};
        int x=7;
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n ; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    break ;
                }
            }
        }
    }
}
