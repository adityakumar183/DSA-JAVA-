package HashMap;
import java.util.*;

public class HashMapMethod {
    public static void method(){
        // Syntax:-
        Map<String , Integer> map = new HashMap<>();

        // Adding Elements:-
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        // Getting value of a key from the
        System.out.println(map.get("Yash"));   // 16
        System.out.println(map.get("Rahul"));    // null

        // Changing/updating value of a key in the HashMap
        map.put("Akash", 25);     // Akash ->25
        System.out.println(map.get("Akash"));   // 25

        // Removing a pair from the HashMap
        System.out.println(map.remove("Akash"));  // 25
        System.out.println(map.remove("Riya"));    // null

        // Checking if a key is in the HashMap
        System.out.println(map.containsKey("Akash"));    // false
        System.out.println(map.containsKey("Yash"));   // true

        // Adding a new entry only if the new key doesn't exist already
        map.putIfAbsent("Yashika", 30);    // will enter
        map.putIfAbsent("Yash", 30);      // will not enter

        // Get all keys in the HashMap
        System.out.println(map.keySet());   // [Lav, Rishika, Yash, Harry, Yashika]

        // Get all values in the HashMap
        System.out.println(map.values());   // [17, 19, 16, 18, 30]

        // Get all entries in the HashMap
        System.out.println(map.entrySet());   // [Lav=17, Rishika=19, Yash=16, Harry=18, Yashika=30]

        // Traversing all entries of HashMap - multiple methods
        // Method 01:-
        for(String key : map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }
        System.out.println();

        // Method 02:-
        for(Map.Entry<String, Integer> e : map.entrySet() ){        // Map.Entry data type hai entrySet ka
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();

        // Method 03:-
        for(var e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        method();
    }
}
