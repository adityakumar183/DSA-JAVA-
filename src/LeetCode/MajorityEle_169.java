package LeetCode;
import java.util.*;
public class MajorityEle_169 {
    public static void main(String[] args) {
        int [] arr= {1,2,1,1,2,1,1,1,3,4,2,1};
        int n=arr.length;
        boolean flag=false;
//......................................................................................................
        // Method 01:->  brute force......
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if(arr[i]==arr[j]){
//                    count ++ ;
//                }
//            }
//........................................................................................................
//        // Method 02:->  sorting..........
//        int count=1;
//        int ans=arr[0];
//        Arrays.sort(arr);
//        for (int i = 1; i <n ; i++) {
//            if (arr[i] == arr[i - 1]) {
//                count++;
//            }
//            else {
//                count = 1;
//                ans = arr[i];
//               }
//........................................................................................................
//            if(count>n/2){
//                System.out.println(arr[i]);
//                flag=true;
//                break ;
//            }
//        }
//        if(!flag){
//            System.out.println("not majority ele found");
//        }
 //......................................................................................................
        // method 03:-> Moore's voting algo.....
         int count=0;
         int ans=0;
         for(int i=0;i<n;i++) {
             if (count == 0) {
                 ans = arr[i];
             }
             if (ans == arr[i]) {
                 count++;
             } else {
                 count--;
             }
         }
         for (int i = 0; i <n ; i++) {
             if(arr[i]==ans){
                 count++;
             }
         }
         if(count>n/2){
             System.out.println(ans);
         }else {
             System.out.println("no majority ele found");
         }
//.........................................................................................................
    }
}
