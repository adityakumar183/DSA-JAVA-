package searching;
/*
       Search the 'target' value in a 2d integer matrix of dimensions (n x m) and return true if found, else return false.
       This matrix has the following properties:
       1. Integers in each row are sorted from left to right.
       2. The first integer of each row is greater than the last integer of the previous row.
       Input :
       Matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

       Output :
       true
 */
public class searching_Q06 {
    public static boolean targetin2DArray(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;

        int st = 0, end = n*m-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midElt = arr[mid/m][mid%m];

            if (midElt == target) return true;

            if (target < midElt){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        System.out.println(targetin2DArray(arr,target));
    }
}
