package Recursion;

public class PowerFinderLogarithmic {
    public static void main(String[] args) {
        int x = 2;
        int pow = 3;
        int ans = findPower(x, pow);
        System.out.println(ans);
    }

    public static int findPower(int x, int pow) {
        if (x == 0) return 0;
        if (pow == 0) return 1;
        int mid = pow / 2;
        int ans = findPower(x, mid);
        if (pow % 2 == 0) {
            return ans * ans;
        } else {
            return ans * ans * x;
        }
    }
}
