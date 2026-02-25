package Sorting;
import java.util.*;
public class bucketSort {
    public static void bucketsort(int[] arr,int bucketSize){
        if (arr.length == 0) return;

        // Find min and max
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Number of buckets
        int bucketCount = (max - min) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);

        // Initialize buckets
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (int num : arr) {
            buckets.get((num - min) / bucketSize).add(num);
        }

        // Sort each bucket and merge
        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket); // simple sort inside bucket
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void display(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {24,76,34,7,3,8,2,99,45};
        int n = arr.length;
        System.out.println("array before sorting: ");
        display(arr);

        bucketsort(arr,5);

        System.out.println("Array after sorting: ");
        display(arr);
    }
}
