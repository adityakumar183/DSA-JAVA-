package time_space_Complaxity;

public class Q1 {
    public static void main(String[] args) {
        int c=0;
        int n=5;
        for (int i = 1; i < n; i+=i) {
            for (int j = 0; j < i; j++) {
             c++;
            }
        }
    }
}
//