package OOPSinJAVA;

import java.util.Arrays;

public class arraylist {
    public static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;

        public void add(int x){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[idx] = x;
            idx++;
            size++;
        }

        public void set(int idx, int val) {
            if (idx >= 0 && idx < size) {
                arr[idx] = val;
            }
        }

        public int get(int idx) {
            if (idx >= 0 && idx < size) {
                return arr[idx];
            }
            System.out.println("Invalid index: " + idx);
            return -1;
        }
    }

    public static void main(String[] args) {
       Arraylist arr = new Arraylist();
       arr.add(2);
       arr.add(3);
       System.out.println(arr.size);
       arr.add(4);
       arr.add(5);
       System.out.println(arr.size);
       arr.set(0,10);
       System.out.println(arr.get(6));
    }
}
