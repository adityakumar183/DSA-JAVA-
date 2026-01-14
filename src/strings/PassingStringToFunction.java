package strings;

public class PassingStringToFunction {
    public static void main(String[] args) {
        String s = "aditya";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s = "kumar";
    }
}
  // output aditya he aayega because string pass by value rule follow karta hai