package Recursion;

public class LastOccurenceOfIndex {
    public static void main(String[] args) {
        int[]arr={1,6,9,7,5,9,6,1,7,6};
        int target=11;
        int index=lastOccurrence(arr,arr.length-1,target);
        System.out.println(index);
    }
    public static int lastOccurrence(int []arr,int idx,int k){
        if(idx==0){
            if (arr[idx]==k)return idx;
            else return -1;
        }
        if (arr[idx]==k){
            return idx;
        }
        return lastOccurrence(arr,idx-1,k);
    }
}
