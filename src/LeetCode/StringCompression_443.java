package LeetCode;

public class StringCompression_443 {
    public static void main(String[] args) {
        String s = "aaaddittttyyyaaaa";
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int i = 0 , j =0;
        while(j<arr.length){
            if(arr[j] == arr[i]) j++;
            else{
                ans.append(arr[i]);
                int len = j-i;
                if(len > 1) ans.append(len);
                i = j;
            }
        }
        ans.append(arr[i]);
        int len = j-i;
        if(len > 1) ans.append(len);
        for(i = 0; i<ans.length(); i++){
            arr[i] = ans.charAt(i);
        }
      //  System.out.println(ans);
        System.out.println(ans.length());
    }
}
