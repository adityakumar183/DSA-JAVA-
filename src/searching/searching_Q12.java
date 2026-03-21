package searching;
/*
     Find the square root of the given non-negative value x. with p precision .
     Input: x=5
     Output: 2.236
 */
public class searching_Q12 {
    public static double sqrt(int n,int precision){
        int st = 0, end = n;
        double ans = 0.0;

        // Step 1: Integer part
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
        // Step 2: Decimal part
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= n) {
                ans += increment;
            }
            ans -= increment; // backtrack
            increment /= 10;
        }
        return ans ;
    }

    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        System.out.println(sqrt(n,p));
    }
}
