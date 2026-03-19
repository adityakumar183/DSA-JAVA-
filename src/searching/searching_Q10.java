package searching;
/*
     A new racing track for kids is being built in New York with 'n' starting spots. The spots are located along a straight line at
     positions x1, x2 ... xn(xi <= 10^9). For each 'i', xi+1 > xi.
     At a time only 'm' children are allowed to enter the race. Since the racetrack is for kids, they may run into each other while
     running. To prevent this, we want to choose the starting spots such that the minimum distance between any two of them is as
     large as possible. What is the largest minimum distance?

     The first line of input will contain the value of n, the number of starting spots.
     The second line of input will contain the n numbers denoting the location of each spot.
     The third line will contain the value of m, number of children.
     Input
     no. of starting spots = 5
     1 2 4 8 9
     no. of kids = 3

     Output
     3
 */
public class searching_Q10 {
    public static boolean isPossible(int[] arr, int k, int dist){
        int kidsplaced = 1;
        int lastkid = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i]-lastkid >= dist){
                kidsplaced++;
                lastkid = arr[i];
            }
        }
        if(kidsplaced >= k){
            return true;
        }
        return false;
    }

    public static int racetrack(int[] arr, int k){
        if(k > arr.length) return -1;
        int st = 1, end = (int)1e9;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(isPossible(arr, k, mid)){      // can k kids be placed such that no 2 kids have distance lesser than mid
                ans = mid;
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int k =3;

        System.out.println(racetrack(arr,k));
    }
}
