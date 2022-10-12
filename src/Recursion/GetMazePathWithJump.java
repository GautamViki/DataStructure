package Recursion;

import java.util.ArrayList;

public class GetMazePathWithJump {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        ArrayList<String> arrayList = getMazePath(1, 1, n, m);
        System.out.println(arrayList);
    }

    public static ArrayList<String> getMazePath(int sRow, int sCol, int dRow, int dCol) {
        if (sRow == dRow && sCol == dCol) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int moveSize = 1; moveSize <= dCol - sCol; moveSize++) {
            ArrayList<String> path = getMazePath(sRow, sCol + moveSize, dCol, dCol);
            for (String p : path) {
                paths.add("hz" + moveSize + p);
            }
        }
        for (int moveSize = 1; moveSize <= dRow - sRow; moveSize++) {
            ArrayList<String> path = getMazePath(sRow + moveSize, sCol, dCol, dCol);
            for (String p : path) {
                paths.add("vt" + moveSize + p);
            }
        }
        for (int moveSize = 1; moveSize <= dRow - sRow && moveSize <= dCol - sCol; moveSize++) {
            ArrayList<String> path = getMazePath(sRow + moveSize, sCol + moveSize, dCol, dCol);
            for (String p : path) {
                paths.add("dg" + moveSize + p);
            }
        }
        return paths;
    }
}
