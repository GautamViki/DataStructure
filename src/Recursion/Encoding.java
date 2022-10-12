package Recursion;

public class Encoding {
    public static void main(String[] args) {
        String num = "1234";
        printEncoding(num, "");
    }

    public static void printEncoding(String num, String ans) {
        if (num.length() == 0) {
            System.out.println(ans);
            return;
        } else if (num.length() == 1) {
            char ch = num.charAt(0);
            if (ch == '0') return;
            else {
                int ascii = ch - '0';
                char code = (char) ('a' + ascii - 1);
                ans = ans + code;
                System.out.println(ans);
            }
        } else {
            char ch = num.charAt(0);
            String remainSub = num.substring(1);
            if (ch == '0') return;
            else {
                int ascii = ch - '0';
                char code = (char) ('a' + ascii - 1);
                printEncoding(remainSub, ans + code);
            }
            String length2Sub = num.substring(0, 2);
            remainSub = num.substring(2);
            int ascii = Integer.parseInt(length2Sub);
            if (ascii <= 26) {
                char code = (char) ('a' + ascii - 1);
                printEncoding(remainSub, ans + code);
            }
        }
    }
}
