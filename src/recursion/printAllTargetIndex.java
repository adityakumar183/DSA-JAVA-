package recursion;
import java.util.Scanner;
public class printAllTargetIndex {
    public static void AllTargetIndex(int [] arr,int x,int idx){
        if(idx==arr.length) return;
        if(arr[idx]==x){
            System.out.println(idx);
        }
        AllTargetIndex(arr,x,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target : ");
        int x = sc.nextInt();
        int [] arr = {1,3,6,7,3,7,2,8,11,3,12,13,1,1};

        AllTargetIndex(arr,x,0);
    }
}
