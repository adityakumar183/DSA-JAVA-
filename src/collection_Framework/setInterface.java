package collection_Framework;
import java.util.*;

public class setInterface {
    public static void HashSetExample() {
        HashSet<Integer> hs = new HashSet<>();      // unique and unordered
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(46);
        hs.add(90);
        hs.add(91);
        System.out.println(hs);    // [1, 2, 3, 90, 91, 46]
        hs.add(1);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);   // [1, 2, 3, 90, 91, 46]
        hs.remove(2);
        System.out.println(hs);     // [1, 3, 90, 91, 46]
        System.out.println(hs.contains(2));   // false
        System.out.println(hs.size());     // 5
    }

    public static void LinkedHashSetExample() {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();      // unique and ordered
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(46);
        hs.add(90);
        hs.add(91);
        System.out.println(hs);    // [1, 2, 3, 46, 90, 91]
        hs.add(1);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);   // [1, 2, 3, 46, 90, 91]
        hs.remove(2);
        System.out.println(hs);     // [1, 3, 46, 90, 91]
        System.out.println(hs.contains(2));   // false
        System.out.println(hs.size());     // 5
    }

    public static void TreeSetExample() {
        TreeSet<Integer> hs = new TreeSet<>();      // unique and sorted ordered
        hs.add(1);
        hs.add(2);
        hs.add(300);
        hs.add(46);
        hs.add(95);
        hs.add(91);
        System.out.println(hs);    // [1, 2, 46, 91, 95, 300]
        hs.add(1);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);   // [1, 2, 46, 91, 95, 300]
        hs.remove(2);
        System.out.println(hs);     // [1, 46, 91, 95, 300]
        System.out.println(hs.contains(2));   // false
        System.out.println(hs.size());     // 5
    }

    public static void main(String[] args) {
        HashSetExample();
        LinkedHashSetExample();
        TreeSetExample();
    }
}
