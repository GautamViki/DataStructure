package Recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        int n=10;
        printDecreae(n);
    }
    public  static void printDecreae(int n){
        if (n==0)return;
        printDecreae(n-1);
        System.out.println(n);
    }
}
