package array;

public class RollNo {
    public static void main(String[] args) {
        int [] arr={23,45,31,62,65,91,99,34,56,45,85,25,36,14,27,28,39,30};
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
