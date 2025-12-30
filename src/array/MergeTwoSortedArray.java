package array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 9};
        int[] arr2 = {2, 5, 10, 11, 15};
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i==n){
            while(j<m){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==m){
            while(i<n){
                arr3[k]=arr2[i];
                i++;
                k++;
            }
        }
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }
}


