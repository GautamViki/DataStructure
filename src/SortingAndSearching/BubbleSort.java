package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
}
