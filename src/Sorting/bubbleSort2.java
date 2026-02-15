package Sorting;

public class bubbleSort2 {
    public static void bubblesort(int[] a){
        int n = a.length;
        // n-1 iterations
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                // last i element are already at correct sorted position,so no need to check them
                if(a[j]<a[j+1]){            // for decreasing order......
                    // swap - a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {7,5,6,4,3,2,1};
        bubblesort(a);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
