package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class targetIndexArraylist {
    public static ArrayList<Integer> allindex(int[] arr,int x,int idx){
        // base case:-
        if(idx>=arr.length){
            return new ArrayList<Integer>();
        }

        // self work:-
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==x){
            ans.add(idx);
        }

        // recursive work:-
        ArrayList<Integer> smallans=allindex(arr,x,idx+1);
        ans.addAll(smallans);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter target : ");
        int x = sc.nextInt();
        int[] arr = {11,34,25,11,23,45,67,11,34,11};

        ArrayList<Integer> ans = allindex(arr,x,0);
        System.out.println(ans);

//        for(Integer i:ans){
//            System.out.println(i);
//        }

    }
}
