package strings;

public class Interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String t = "Raghav";
        String q = new String("Raghav");
        // Raghav -> Madhav
      //  s.charAt(0) = 'm';      // gives error
      //  s.charAt(2) = 'd';     // gives error

        s = " Madhav";
        System.out.println(t);
    }
}
