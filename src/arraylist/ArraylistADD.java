package arraylist;

import java.util.ArrayList;

public class ArraylistADD {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list +" "+ list.size());
        list.add(27);
        System.out.println(list +" "+ list.size());
        list.add(300);
        System.out.println(list +" "+ list.size());
        list.add(400);
        System.out.println(list +" "+ list.size());
        list.remove(1);
        System.out.println(list +" "+ list.size());
    }
}
