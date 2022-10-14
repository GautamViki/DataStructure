package Recursion;

import java.util.Arrays;

public class KnightProblem {
    static int count = 0;

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int move = 2;
        int[][] board = new int[row][col];
        followKnight(board, 3, 2, move);
//        System.out.println(count);
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    public static void followKnight(int[][] board, int x, int y, int move) {
        if (x < 0 || x > board.length - 1 || y < 0 || y > board[0].length - 1) return;
        if (move == 0) {
//            System.out.println(x + "" + y);
            board[x][y] = 1;
            return;
        }
        followKnight(board, x + 2, y - 1, move - 1);
        followKnight(board, x - 2, y - 1, move - 1);
        followKnight(board, x - 2, y + 1, move - 1);
        followKnight(board, x - 1, y + 2, move - 1);
        followKnight(board, x + 1, y + 2, move - 1);
        followKnight(board, x - 1, y - 2, move - 1);
        followKnight(board, x + 1, y - 2, move - 1);
        followKnight(board, x + 2, y + 1, move - 1);
    }
}
