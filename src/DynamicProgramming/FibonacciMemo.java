package DynamicProgramming;

public class FibonacciMemo {
    public static void main(String[] args) {
        int n = 100;
        long[] memo = new long[n + 1];
        long fib = printFib(n, memo);
        System.out.println(fib);
    }

    public static long printFib(int n, long[] memo) {
        if (memo[n] == 0) {
            if (n < 2) {
                memo[n] = n;
            } else {
                memo[n] = printFib(n - 1, memo) + printFib(n - 2, memo);
            }
        }
        return memo[n];
    }
}

