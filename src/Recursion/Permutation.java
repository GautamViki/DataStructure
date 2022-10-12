package Recursion;

public class Permutation {
    static int count = 0;

    public static void main(String[] args) {
        String str = "abcd";
        printPermutation(str, "");
        System.out.println(count);
    }

    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            count++;
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftSub = str.substring(0, i);
            String rightSub = str.substring(i + 1);
            String totalSub = leftSub + rightSub;
            printPermutation(totalSub, ch + ans);
        }
    }

}
