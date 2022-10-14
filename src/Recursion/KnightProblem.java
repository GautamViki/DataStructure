package Recursion;

import java.util.Arrays;

public class KnightProblem {


    public static void main(String[] args) {
        int row = 10;
        int col = 10;
        int[][] board = new int[row][col];
        followKnight(board, 4, 7, 6);
        int count = 0;

        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(board[i]));
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("\n" + count + " position");
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
