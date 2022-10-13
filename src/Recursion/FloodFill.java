package Recursion;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row ");
        int n = sc.nextInt();
        System.out.print("Enter number of column ");
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row " + (i + 1));
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        boolean[][] visitor = new boolean[n][m];
        printFloodFillPath(0, 0, maze, "", visitor);
    }


    public static void printFloodFillPath(int row, int col, int[][] maze, String path, boolean[][] visitor) {
        if (row < 0 || row == maze.length || col < 0 || col == maze[0].length ||
                maze[row][col] == 1 || visitor[row][col] == true)
            return;
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        visitor[row][col] = true;
        printFloodFillPath(row + 1, col, maze, path + 'D', visitor);
        printFloodFillPath(row - 1, col, maze, path + 'T', visitor);
        printFloodFillPath(row, col + 1, maze, path + 'R', visitor);
        printFloodFillPath(row, col - 1, maze, path + 'L', visitor);
        visitor[row][col] = false;
    }
}
