package arraylist;
import java.util.ArrayList;
import java.util.List;
public class Arraylist_2D {
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b=new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(60);

        List<List<Integer>> l=new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        // print karne ke liye......   Method 01:->
        System.out.println("first method : ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i)+" ");
        }
        System.out.println();
        // Method 02:->
        System.out.println("2nd method : ");
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x= l.get(i);      // ager x nahi use karna hai to x ke place pe l.get(i) rakh do
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }

        //kisi ek element ko print karne ke liye.....
        System.out.println("single ele : ");
        System.out.println(l.get(1).get(1));
    }
}
