package recursion;

public class preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" ");  // pre
        pip(n-1);
        System.out.print(n+" ");  // in
        pip(n-1);
        System.out.print(n+" ");  // post
    }
    public static void main(String[] args) {
        pip(3);
    }
}


// print zigzag = 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3