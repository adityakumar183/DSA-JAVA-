package recursion;
import java.util.Scanner;
public class lastIndex {
    public static int lastindex(int[] arr,int x,int idx){
        if(idx==arr.length){
            return -1;
        }
       int smallans = lastindex(arr,x,idx+1);
        if(smallans==-1 && arr[idx]==x){
            System.out.println(idx);
            return idx;
        }
        return smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target : ");
        int x = sc.nextInt();
        int[] arr = {22,44,55,23,14,22,76,34,97,33,55};

        int ans = lastindex(arr,x,0);
        if(ans==-1){
            System.out.println("element not exists");
        }
    }
}
