package Recursion;

public class PrintArray {
     public static void main(String[] args) {
        int[]arr={10,5,8,9,12,14,23,15};
        printArray(arr,0);
    }
    public static void printArray(int[]arr,int idx){
         if (idx== arr.length)return;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }
}
