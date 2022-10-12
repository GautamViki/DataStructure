package Recursion;

public class MazePath {
    public static void main(String[] args) {
        int n = 1;
        int m = 1;
        int path = getPaths(n, m);
        System.out.println(path);
    }

    public static int getPaths(int n, int m) {
        if (n == 0 && m == 0) return 1;
        if (n < 0 || m < 0) return 0;
        return getPaths(n - 1, m) + getPaths(n, m - 1);
    }
}
