package strings;

public class SubString {
    public static void main(String[] args) {
        String str = "Aditya";
        String x = "";
        System.out.println(x.length());
        
//        System.out.println(str.substring(2));   // print 2 and aage wale index element
//        System.out.println(str.substring(1,4));  // (bcd) last wale index ko chor dena hota hai
//        System.out.println(str.substring(2,2));   // nothing
//        System.out.println(str.substring(0,5));   //abcde
        
        // print all substring...
        for (int i = 0; i < str.length(); i++) {
            for (int j =i+1; j <= str.length() ; j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
