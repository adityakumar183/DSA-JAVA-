package HashSet;
import java.util.*;

public class iterationOnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(15);
        set.add(27);
        set.add(39);
        set.add(43);
        set.add(54);
        set.add(65);
        for(int ele : set ){
            System.out.print(ele+" ");
        }
        System.out.println();
        set.clear();   // for empty set
        System.out.println(set);  // []
        set.add(65);
        set.add(65);
        System.out.println(set);  // [65]
    }
}


// in HashSet occurrence of every element is one