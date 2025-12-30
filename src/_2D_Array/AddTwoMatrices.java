package _2D_Array;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int [][] a={{3,2,4},{1,5,7},{6,8,9}};
        int [][] b={{13,12,14},{11,15,17},{16,18,19}};
        int m=a.length;
        int n=a[0].length;
        int [][] c=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
     // ager without creating extra array sum print karna ho to direct dono ka add ko sum me print kar denge