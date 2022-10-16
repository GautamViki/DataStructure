package SortingAndSearching;

import java.util.Arrays;

public class DutchFlagProblem {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 2, 0, 1, 1};
        sorting(arr);
    }

    public static void sorting(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0: {
                    int temp = arr[i];
                    arr[i] = arr[left];
                    arr[left] = temp;
                    left++;
                    break;
                }
                case 1:
                    break;
                case 2: {
                    int temp = arr[i];
                    arr[i] = arr[right];
                    arr[right] = temp;
                    right--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
