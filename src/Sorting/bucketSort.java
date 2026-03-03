package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    public static void bucketsort(float[] arr) {
        int n = arr.length;
        // buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // creat empty buckets
        for(int i = 0; i < n; i++){
            buckets[i] = new ArrayList<Float>();
        }

        // add elements into our buckets
        for(int i = 0; i < n; i++){
            int bucketindex = (int)arr[i] * n;
            buckets[bucketindex].add(arr[i]);
        }

        // sort each bucket individually
        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        // merge all buckets to get final sorted array
        int index = 0;
        for(int i = 0; i < buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void display(float[] arr) {
        for(float val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        float[] arr = {0.3f, 0.5f, 0.9f, 0.4f, 0.7f};
        System.out.println("array before sorting: ");
        display(arr);

        bucketsort(arr);

        System.out.println("Array after sorting: ");
        display(arr);
    }
}
