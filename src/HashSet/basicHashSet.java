package HashSet;
import java.util.*;

public class basicHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(100);
        set.add(20);
        set.add(3);
        set.add(40);
        set.add(59);
        System.out.println(set);   // [3, 100, 20, 40, 59]
        System.out.println("Size is : " + set.size());  // 5

        // search
        System.out.println(set.contains(100));  // true
        System.out.println(set.contains(2));   // false
        set.add(2);
        System.out.println(set.contains(2));   // true
        System.out.println("Size is : " + set.size());     // 6

        // remove
        set.remove(2);
        System.out.println(set);   // [3, 100, 20, 40, 59]
        System.out.println("Size is : " + set.size());   // 5

        Object[] arr = set.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");      // 3 100 20 40 59
        }
        System.out.println();
    }
}

// it is a interface/data structure
// in hashset insert, delete, search and size possible in O(1) Time Complexity.
// values print in unordered way