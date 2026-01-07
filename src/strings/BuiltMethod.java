package strings;

public class BuiltMethod {
    public static void main(String[] args) {
        String str="aditya kumar";
        System.out.println(str.length());
        System.out.println(str.indexOf('k'));
        System.out.println(str.indexOf('z'));  // ans = -1
        System.out.println(str.lastIndexOf('a'));   // last se jo pahle aayega uska index batatyega

        String a= "abcdeffffffff";
        String b= "abcdef";
        System.out.println(a.compareTo(b));

        String c= "The dark show";
        System.out.println(c.contains("ark"));    // true
        System.out.println(c.contains("arks"));    // false

        System.out.println(c.startsWith("dark"));   // false
        System.out.println(c.startsWith("the"));   // true

        System.out.println(c.endsWith("ow"));   // true
        System.out.println(c.endsWith("nat"));  // false

        System.out.println(c.toUpperCase());   // THE DARK SHOW
        System.out.println(c.toLowerCase());   // the dark show

        System.out.println(a.concat(b));    // concat means add karna do string ko :  abcdeffffffffabcdef

    }
}
