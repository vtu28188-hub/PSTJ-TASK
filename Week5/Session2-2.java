class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {

            // Kadane for maximum subarray
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane for minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of normal and circular subarray
        return Math.max(maxSum, totalSum - minSum);
    }
}




Input
nums =
[1,-2,3,-2]
Output
3
Expected
3
