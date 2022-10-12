package Recursion;

public class FindMaximumInArray {
    public static void main(String[] args) {
        int[]arr={10,59,8,90,12,14,23,15};
        int ans=findMax(arr,0);
        System.out.println(ans);
    }
    public static int findMax(int []arr,int idx){
        if (idx== arr.length-1)return arr[idx];
        if(arr[idx]>findMax(arr,idx+1)){
            return arr[idx];
        }
        return findMax(arr,idx+1);
    }
}
