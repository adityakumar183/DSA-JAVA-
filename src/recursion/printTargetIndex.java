package recursion;
import java.util.Scanner;
public class printTargetIndex {
    public static int findindex(int [] arr , int x , int idx){
        // base case:-
        if(idx >= arr.length) return -1;

        // self work:-
        if(arr[idx] == x) return idx;

        // recursive work:-
        return findindex(arr, x , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target value: ");
        int x =sc.nextInt();
        int [] arr ={2,4,5,7,8,2,7,4,8};

        System.out.println(findindex(arr,x,0));
    }
}
