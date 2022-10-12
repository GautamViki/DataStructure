package Recursion;

public class PrintIncreaseDecrease {
    public static void main(String[] args) {
        int n=5;
        printInDe(n);
    }
    public  static void printInDe(int n){
        if (n==0)return;
        System.out.println(n);
        printInDe(n-1);
        System.out.println(n);
    }
}
