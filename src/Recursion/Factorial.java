package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int fact=printFactorial(n);
        System.out.println(fact);
    }
    public  static int printFactorial(int n){
        if (n==0)return 1;
        return n*printFactorial(n-1);
    }
}
