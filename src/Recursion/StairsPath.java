package Recursion;

public class StairsPath {
    public static void main(String[] args) {
        int numOfStairs = 6;
        int path = getPath(numOfStairs);
        System.out.println(path);
    }

    //    take 1,2 or 3 steps at a time find total number of path;
    public static int getPath(int numOfStairs) {
        if (numOfStairs == 0) return 1;
        if (numOfStairs < 0) return 0;
        int res = getPath(numOfStairs - 1) + getPath(numOfStairs - 2) + getPath(numOfStairs - 3);
        return res;
    }
}
