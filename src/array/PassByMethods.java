package array;

public class PassByMethods {
    public static void main(String[] args) {
        int [] arr={22,34,24,25,26};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }                                                        // pass by reference.

    public static void change(int[] arr) {
        arr[1]=23;
    }
}
