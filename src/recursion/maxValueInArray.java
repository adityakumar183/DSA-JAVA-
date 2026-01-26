package recursion;

public class maxValueInArray {
    public static int maxvalue(int[] arr,int idx){
        // base case:-
        if(idx==arr.length-1){
            return arr[idx];
        }
        // recursive work:-
        int smallAns = maxvalue(arr,idx+1);

        // self work:-
        return Math.max(arr[idx],smallAns);

    }
    public static void main(String[] args) {
        int[] arr = {3,10,3,2,15};

        System.out.println(maxvalue(arr,0));
    }
}