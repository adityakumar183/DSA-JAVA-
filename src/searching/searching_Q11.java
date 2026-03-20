package searching;
/*
        You are given a sorted array consisting of only integers where every element appears exactly twice,
        except for one element which appears exactly once.
        Return the single element that appears only once.
        Your solution must run in O(log n) time and O(1) space.

        Input: arr = [1,1,2,3,3,4,4,8,8]
        Output: 2
 */
public class searching_Q11 {
    public static int singleElement(int[] arr) {
        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;
            if (mid % 2 == 1){
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                st = mid + 2;
            } else {
                end = mid;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleElement(arr));
    }
}
