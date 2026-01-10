package LeetCode;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int [] a= {1,2,3,0,0,0};
        int [] b= {2,5,6};
        int m=b.length;
        int n=b.length;

        int index=m+n-1; int i=m-1; int j=n-1;
        while(i >= 0 && j >=0){
            if(a[i]<=b[j]){
                a[index]=b[j];
                index--;
                j--;
            }else{
                a[index]=a[i];
                index--;
                i--;
            }
        }
        if(i < 0){
            while(j>=0){
                a[index]=b[j];
                index--;
                j--;
            }
        }
//        if(j < 0){
//            while(i>=0){
//                a[index]=a[i];
//                i--;
//                index--;
//            }
//        }
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
