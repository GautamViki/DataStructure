package Recursion;

public class FirstOccurenceIndex {
    public static void main(String[] args) {
        int[]arr={5,6,9,7,5,9,6,1,7,6};
        int target=5;
        int index=firstOuccrance(arr,0,target);
        System.out.println(index);
    }
    public static int firstOuccrance(int []arr,int idx,int k){
        if (idx== arr.length-1){
            if (arr[idx]==k) return idx;
            else return -1;
        }
        if(arr[idx]==k){
            return idx;
        }
        return firstOuccrance(arr,idx+1,k);
    }
}
