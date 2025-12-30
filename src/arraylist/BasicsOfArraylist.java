package arraylist;

import java.util.ArrayList;

public class BasicsOfArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(6);
        arr.add(0,10);           // initialize value
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        System.out.println(arr.size());

        System.out.println(arr);       // value print

        for (int i = 0; i <=5; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.set(2,300);       // value change

        for (int i = 0; i < arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.add(90);    // push back            // extra value add

        System.out.println(arr.size());
        System.out.print(arr);
    }
}
