package Sorting;

public class radixSort {
    public static int findmax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void countsort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < n; i++){    // make frequency array
            count[(arr[i] / place) % 10]++;
        }

        // prefix sum array of count array
        for(int i = 1; i < count.length; i++){
            count[i] += count[i - 1];
        }

        for(int i = n - 1; i >= 0; i--){
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        // copy all elements of output to array
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    public static void radixsort(int[] arr){
        int max = findmax(arr);

        for(int place = 1; max/place > 0; place *= 10){
            countsort(arr,place);
        }
    }

    public static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {22,55,88,43,667,134,8345,9652,10758};
        int n = arr.length;
        System.out.println("unsorted array : ");
        display(arr);

        radixsort(arr);

        System.out.println("Sorted array: ");
        display(arr);
    }
}

