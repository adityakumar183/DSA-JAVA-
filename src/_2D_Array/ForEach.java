package _2D_Array;
public class ForEach {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.print("1D array : ");
        for(int ele : a){
            System.out.print(ele +" ");
        }System.out.println();


        int [][] b={{1,2,3},{4,5,6}};
        System.out.println("2D array : ");
        for(int[] ele : b){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
