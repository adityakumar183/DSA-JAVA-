package array;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int [] arr= {0,1,2,0,1,2,1,2,0,0};
        int n= arr.length;
        int noofzero=0, noofones=0;

        // two pass solution:->
        for (int i = 0; i < n; i++) {
            if(arr[i]==0) noofzero++;
            if(arr[i]==1) noofones++;
        }
        for (int i = 0; i < n; i++) {
            if(i<noofzero) arr[i]=0;
            else if(i<noofzero+noofones) arr[i]=1;
            else arr[i]=2;
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
