package LeetCode;

public class SetMatricesZero_73 {
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
        int[][] arr = {{0,4,7,11,15}, {2,5,8,12,19}, {3,6,0,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("matrices is : ");
        print(arr);

//        // Method 01:->  with help of extra array
//        int [][] helper=new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                helper[i][j] = arr[i][j];
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(helper[i][j]==0){
//                    // set the ith row and jth column 0 in arr
//                    for (int b = 0; b < n; b++) {
//                        arr[i][b]=0;
//                    }
//                    for(int a=0;a<m;a++){
//                        arr[a][j]=0;
//                    }
//                }
//            }
//        }

//        // method 02:->  taking two single extra array
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//        // marking the particular row and col
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j]==0){
//                    row[i]=true;
//                    col[j]=true;
//                }
//            }
//        }
//        // set the 'true' row to 0
//        for (int i = 0; i < m; i++) {
//            if(row[i]== true){
//                for (int j = 0; j < n; j++) {
//                    arr[i][j]=0;
//                }
//            }
//        }
//        // set the 'true' col to 0
//        for (int j = 0; j < m; j++) {
//            if(col[j]== true){
//                for (int i = 0; i < n; i++) {
//                    arr[i][j]=0;
//                }
//            }
//        }


        // Method 03:-> constant extra space solution
        boolean zeroRow=false;
        boolean zeroCol=false;
        // check the 0th row
        for (int j = 0; j < n; j++) {
            if(arr[0][j]==0){
                zeroRow=true;
                break;
            }
        }
        // check the 0th col
        for (int i = 0; i < m; i++) {
            if(arr[i][0]==0){
                zeroCol=true;
                break;
            }
        }
        // ..............................................................................................
        // traverse in the submatrix without 0th row and 0th col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        // traverse in the 0th row
        for (int j = 1; j < n; j++) {
            if(arr[0][j]==0){   // set jth col to 0
                for (int i = 0; i < m; i++) {
                    arr[i][j]=0;
                }
            }
        }
        // traverse in the 0th col
        for (int i = 1; i < m; i++) {
            if(arr[i][0]==0){   // set ith row to 0
                for (int j = 0; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        // ..............................................................................................
        if(zeroRow==true){  // set the 0th row to 0
            for (int j = 0; j < n; j++) {
                arr[0][j]=0;
            }
        }
        if(zeroCol==true){  // set the 0th col to 0
            for (int i = 0; i < m; i++) {
                arr[i][0]=0;
            }
        }


        System.out.println("after setting to zero in matrices  : ");
        print(arr);
    }
}
