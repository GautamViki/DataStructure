package SortingAndSearching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        sortedSquare(arr);
    }

    public static void sortedSquare(int[] arr) {
        int i = 0, j = arr.length - 1;
        int[] result = new int[arr.length];
        for (int idx = arr.length - 1; idx >= 0; idx--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[idx] = arr[i] * arr[i];
                i++;
            } else {
                result[idx] = arr[j] * arr[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
