package recursion;

public class sumOfArrayElement {
    public static int sumofarray(int[] arr,int idx){
        // base case:-
        if(idx == arr.length-1) return arr[idx];

        // recursive work:-
        int smallAns= sumofarray(arr,idx+1);

        //self work:-
        return arr[idx]+smallAns;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,20,1};

        System.out.println(sumofarray(arr,0));
    }
}
