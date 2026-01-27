package recursion;

import java.util.Scanner;

public class findValueInArray {
    public static boolean findvalue(int [] arr,int x,int idx){
        // base case:-
        if(idx>=arr.length) return false;

        // self work:-
        if(arr[idx]==x) return true;

        //recursive work:-
        return findvalue(arr,x,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target value : ");
        int x=sc.nextInt();
        int [] arr = {4,12,54,14,3,8,6,1};

        if(findvalue(arr,x,0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
