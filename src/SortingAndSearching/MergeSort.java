package SortingAndSearching;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        sorting(arr, 0,arr.length-1,[]);
    }

    public static void sorting(int[] arr,int low,int high,int[]temp) {
        if (low<high){
            int mid=low+(high-low)/2;
            sorting(arr,low,mid,temp);
            sorting(arr,mid+1,high,temp);
            merging(arr,low,mid,high,temp);
        }
    }
}
