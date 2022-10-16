package SortingAndSearching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 7, 1, 9, 2, 10, 3, 14, 12};
        int key = 2;
        boolean ack = linearSearching(arr, key);
        System.out.println(ack);
    }

    public static boolean linearSearching(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
