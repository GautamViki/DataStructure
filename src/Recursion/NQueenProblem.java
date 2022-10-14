package Recursion;

public class NQueenProblem {
    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        System.out.println();
        nQueen(board, 0, "");
        System.out.println("\n" + count + "  Ways");
    }

    public static void nQueen(int[][] board, int row, String position) {
        if (row == board.length) {
            System.out.println("Indexes " + position);
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isQueenSafe(board, col, row)) {
                board[row][col] = 1;
                nQueen(board, row + 1, position + row + col + " ");
                board[row][col] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int[][] board, int col, int row) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }
}
