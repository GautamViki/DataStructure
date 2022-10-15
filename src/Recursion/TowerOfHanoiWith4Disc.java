package Recursion;

public class TowerOfHanoiWith4Disc {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi("S", "H1", "H2", "D", n);
    }

    public static void towerOfHanoi(String src, String hp1, String hp2, String dst, int n) {
        if (n == 1) {
            System.out.println(src + " ==> " + dst);
        } else if (n == 2) {
            System.out.printf("%s ==> %s %s ==> %s %s ==> %s%n", src, hp1, src, dst, hp1, dst);
        } else {
            towerOfHanoi(src, hp1, dst, hp2, n - 2);
            System.out.printf("%s ==> %s %s ==> %s %s ==> %s%n", src, hp1, src, dst, hp1, dst);
            towerOfHanoi(hp2, hp1, src, dst, n - 2);
        }
    }
}
