package time_space_Complaxity;

public class Q2 {
    public static void main(String[] args) {
        int c = 0;
        int n = 10;
        for (int i = 1; i < n; i+=i) {
            for (int j = n; j >=0; j--) {
                c++;
            }
        }
    }
}
/*
  Time Complaxity:-

       T.C. = O{(n+1)* log n}
            = O{n*log n + log n}
            = O( n log n )

 */