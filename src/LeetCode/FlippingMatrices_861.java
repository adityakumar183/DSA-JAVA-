package LeetCode;

public class FlippingMatrices_861 {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] arr= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m= arr.length;
        int n= arr[0].length;
        System.out.println("matrice is : ");
        print(arr);


        // put 1 at the 0th position of every row
        for (int i = 0; i < m; i++) {
            if(arr[i][0]==0){            // flip that row
                for (int j = 0; j < n; j++) {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        // flip those columns where ( no. of 0's > no. of 1's )
        for(int j=1;j<n;j++){
        int noofzeros = 0 , noofones = 0 ;
            for (int i = 0; i < m; i++) {
            if(arr[i][j]==0) noofzeros++;
            else noofones++;
            }
            if(noofzeros>noofones){           // flip that columns
                for (int i = 0; i < m; i++) {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        System.out.println("flipping matrice : ");
        print(arr);

        // calculating the score
        int score = 0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for (int i = 0; i < m; i++) {
                score += arr[i][j]*x;
            }
            x *= 2;
        }
        System.out.print("score is : "+ score);
    }
}
