package SortingAndSearching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));

    }
}
