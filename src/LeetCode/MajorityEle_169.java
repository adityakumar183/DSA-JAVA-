package LeetCode;

public class MajorityEle_169 {
    public static void main(String[] args) {
        int [] arr= {1,2,1,1,2,3,1,3,3,4,2,1};
        int n=arr.length;
        boolean flag=false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    count ++ ;
                }
            }
            if(count>n/2){
                System.out.println(arr[i]);
                flag=true;
                break ;
            }
        }
        if(!flag){
            System.out.println("not majority ele found");
        }
    }
}
