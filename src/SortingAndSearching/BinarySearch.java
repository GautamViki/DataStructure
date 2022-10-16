package SortingAndSearching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        Arrays.sort(arr);
        int key = 32;
        System.out.println(Arrays.toString(arr));
        boolean ack = binarySearch(arr, 0, arr.length - 1, key);
        System.out.println(ack);
    }

    public static boolean binarySearch(int[] arr, int st, int end, int key) {
        if (st > end) return false;

        int mid = st + (end - st) / 2;
        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (key < arr[mid]) {
            return binarySearch(arr, st, mid - 1, key);
        } else {
            return true;
        }
    }
}
