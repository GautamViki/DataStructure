package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        int n=10;
        printIncrese(n);

    }
    public  static void printIncrese(int n){
        if (n==0)return;
        System.out.println(n);
        printIncrese(n-1);
    }
}
