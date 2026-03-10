package searching;

import java.util.Scanner;

/*
     Find the square root of the given non-negative value x. Round it off to the nearest floor integer value.
     Input: x=4
     Output: 2

     Input: x=11
     Output: 3

 */
public class searching_Q02 {
    public static int sqrt(int n){
        int st = 0, end = n;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int val = mid*mid;
            if(val == n){
                return mid;
            }
            else if(val < n){
                st = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sqrt(n));
    }
}
