package SortingAndSearching;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        sorting(arr, 0, arr.length - 1);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sorting(arr, low, mid);
            sorting(arr, mid + 1, high);
            merging(arr, low, mid, high);
        }
    }

    public static void merging(int[] arr, int si, int mid, int ei) {
        int[] merger = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merger[x++] = arr[idx1++];
            } else {
                merger[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merger[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merger[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }
}
