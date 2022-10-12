package Recursion;

import java.util.ArrayList;

public class KeyboardCombination {
    static String[] keyBoard = {".;", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vw", "xyz"};

    public static void main(String[] args) {
        String num = "02";
        ArrayList<String> ans = printCombination(num);
        System.out.println(ans);
    }

    public static ArrayList<String> printCombination(String num) {
        if (num.length() == 0) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        String ch = num.substring(0, 1);
        String subStr = num.substring(1);

        ArrayList<String> ansList = printCombination(subStr);
        ArrayList<String> givenList = new ArrayList<>();
        for (int i = 0; i < keyBoard[Integer.parseInt(ch)].length(); i++) {
            char chh = keyBoard[Integer.parseInt(ch)].charAt(i);
            for (String str : ansList) {
                givenList.add(chh + str);
            }
        }
        return givenList;
    }
}
