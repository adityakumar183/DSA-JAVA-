package HashMap;
 /*
        Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum
        number of times, print any one of them.

        Sample Input:
        n=6
        arr[] = {1, 3, 2, 1, 4, 1)

        Expected Output :
        1
    */

import java.util.*;
public class maxFrequency {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};

        Map<Integer, Integer> freq = new HashMap<>();
        for(int ele : arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }
            else{
                freq.put(ele, freq.get(ele) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int maxFreq = 0;
        int ansKey = -1;
//        for(var e : freq.entrySet()){
//            if(e.getValue() > maxFreq){
//                maxFreq = e.getValue();
//                ansKey = e.getKey();
//            }
//        }
        for(int key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times" , ansKey , maxFreq);
    }
}

          // T.C. = O(n)
