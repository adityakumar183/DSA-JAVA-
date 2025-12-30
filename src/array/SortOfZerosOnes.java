package array;

public class SortOfZerosOnes {
    public static void main(String[] args) {
        int [] arr={1,0,1,1,1,0,0,0,1,0,1,0,0,1};
        int n=arr.length;
        int noOfZeros=0;

//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0) noOfZeros++;
//        }
//        for (int i = 0; i < n; i++) {
//            if(i<noOfZeros) arr[i]=0;
//            else arr[i]=1;
//        }
//        for(int ele : arr){
//            System.out.print(ele +" ");
//        }

        // method 02  -> one pass solution
        // isme hum else if ka v use kar sakte hai (don't want to use break)
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
