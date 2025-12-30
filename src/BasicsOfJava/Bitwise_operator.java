package BasicsOfJava;

public class Bitwise_operator {
    public static void main(String[] args) {
        int p = 9 , q = 10 ;

        System.out.println( p | q );                  // koi ek v bit 1 hoga to result true ho jayega.
        System.out.println( p & q );                //  dono bit 1 hoga tabi result true hoga.
        System.out.println( p ^ q );              //  dono bit different hoga tabhi result true hoga.


        System.out.println( ~ p );            // bit ko inverse kar deta hai.


        System.out.println( q << 1 );     // bit ek place left side aage bad jayega or piche blank space ke place pe 0 aa jayega.
        System.out.println( q << 2);     //  isme bit do place aage bad jayega.
        System.out.println( q >> 1);    // isme bit ek place right side move karega or extra bit remove ho jayega.
        System.out.println( q >> 2);   // isme bit do plce right side me aage badega.
    }
}
