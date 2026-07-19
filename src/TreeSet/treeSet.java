package TreeSet;
import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();    // sorted
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(set);   // [1, 2, 3, 4, 5]
    }
}


// It ensures elements remain unique and sorted.
