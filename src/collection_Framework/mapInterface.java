package collection_Framework;
import java.util.*;

public class mapInterface {
    public static void MapInterfaceExample() {
        Map<Integer, String> map = new HashMap<>();   // unordered
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);        // {1=one, 2=two, 3=three}
        System.out.println(map.get(1));       // one
        System.out.println(map.containsKey(4));    // false
        System.out.println(map.containsValue("four"));   // false
        map.put(1, "five");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        map.putIfAbsent(1, "SEVEN");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        System.out.println(map.entrySet());   // [1=five, 2=two, 3=three]
        System.out.println(map.values());    // [five, two, three]


        // Iterating over keys in a map
        for(Integer i : map.keySet()){
            System.out.println(i);    // 1 2 3
        }

        // Iterate over the key,value mapping
        for(var e : map.entrySet()){
            System.out.println(e.getValue());
        }
    }

    public static void LinkedHashMapInterfaceExample() {
        Map<Integer, String> map = new LinkedHashMap<>();   // ordered
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);        // {1=one, 2=two, 3=three}
        System.out.println(map.get(1));       // one
        System.out.println(map.containsKey(4));    // false
        System.out.println(map.containsValue("four"));   // false
        map.put(1, "five");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        map.putIfAbsent(1, "SEVEN");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        System.out.println(map.entrySet());   // [1=five, 2=two, 3=three]
        System.out.println(map.values());    // [five, two, three]


        // Iterating over keys in a map
        for(Integer i : map.keySet()){
            System.out.println(i);    // 1 2 3
        }

        // Iterate over the key,value mapping
        for(var e : map.entrySet()){
            System.out.println(e.getValue());
        }
    }

    public static void TreeMapInterfaceExample() {
        Map<Integer, String> map = new TreeMap<>();   // sorted ordered
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);        // {1=one, 2=two, 3=three}
        System.out.println(map.get(1));       // one
        System.out.println(map.containsKey(4));    // false
        System.out.println(map.containsValue("four"));   // false
        map.put(1, "five");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        map.putIfAbsent(1, "SEVEN");
        System.out.println(map);    // {1=five, 2=two, 3=three}
        System.out.println(map.entrySet());   // [1=five, 2=two, 3=three]
        System.out.println(map.values());    // [five, two, three]


        // Iterating over keys in a map
        for(Integer i : map.keySet()){
            System.out.println(i);    // 1 2 3
        }

        // Iterate over the key,value mapping
        for(var e : map.entrySet()){
            System.out.println(e.getValue());
        }
    }

    public static void main(String[] args) {
        MapInterfaceExample();
        LinkedHashMapInterfaceExample();
    }
}
