package recursion;

public class checkSorted {
    public static boolean check(int [] arr , int idx){
        // base case:-
        if(idx>=arr.length-1) return true;

        // self work:-
        if(arr[idx]>arr[idx+1]) return false;

        // recursive work:-
        return check(arr,idx+1);
    }
    public static void main(String[] args) {
        int [] arr = { 1,2,4,6,8,9,22,5,88};

        if(check(arr,0)){
            System.out.println("sorted array");
        }else {
            System.out.println("not sorted array");
        }
    }
}
