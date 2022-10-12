import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 3, 7, 10, 9};
        int k = 3;
        Arrays.sort(arr);
        for (Integer i : arr) {
            if (i == k - 1) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}