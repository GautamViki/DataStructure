package Recursion;

public class TargetSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 25, 15, 35, 40, 45};
        int target = 60;
        printSubArrayOfTargetSum(arr, 0, "", 0, target);
    }

    public static void printSubArrayOfTargetSum(int[] arr, int idx, String set, int sum, int target) {
        if (idx == arr.length) {
            if (target == sum) {
                System.out.println(set);
            }
            return;
        }
        printSubArrayOfTargetSum(arr, idx + 1, set + arr[idx] + " ", sum + arr[idx], target);
        printSubArrayOfTargetSum(arr, idx + 1, set, sum, target);
    }
}
