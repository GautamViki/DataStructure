package Recursion;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        int []arr={10,14,51,74,24,12,23,41,65,21};
        printRevers(arr,0);
    }
    public static void printRevers(int[]arr,int idx){
        if (idx== arr.length)return;
        printRevers(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
