package TreeSet;
import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>();

        // Adding Elements:-
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}

// similar like self-balancing binary search tree(Red-Black Tree).
// sort on the basis of key.
// T.C = O(log n)