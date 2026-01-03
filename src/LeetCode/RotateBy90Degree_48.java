package LeetCode;

public class RotateBy90Degree_48 {
    public static void print(int [][] arr){
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][]arr= {{1,2,3},{3,4,5},{5,6,7}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("arrays are : ");
        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("after transpose : ");
        print(arr);

        // rotate :-> reverse the row
        for (int i = 0; i < m; i++) {
            int a = 0, b = m - 1;
            // swap
            while (a < b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        System.out.println("after 90 degree rotate : ");
        print(arr);
    }
}
