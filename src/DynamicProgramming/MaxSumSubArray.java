package DynamicProgramming;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, -2, 6, -12, 7, -1, 6};
        int curSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum < 0) {
                curSum = 0;
            }
            if (curSum > maxSum) {
                maxSum = curSum;
//                System.out.println(maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
