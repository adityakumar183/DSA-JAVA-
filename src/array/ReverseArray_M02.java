package array;

public class ReverseArray_M02 {
    public static void swap(int [] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr= {2,7,5,22,9,88,66,99,4,};
        int n=arr.length;

        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        // reverse
      //  int i=3 , j=6;          // part of array reverse
        int i=0 , j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
            }

        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
}
