package LeetCode;

public class excelSheetColumnTitle_168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}


/*
     // Question:-
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...


     // Another method:-
             if (columnNumber == 0) return "";
             columnNumber--; // adjust for 1-indexed
             char c = (char) ('A' + (columnNumber % 26));
             return convertToTitle(columnNumber / 26) + c;
 */