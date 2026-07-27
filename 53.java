class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either add current element to existing subarray or start new subarray at nums[i]
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Keep track of the overall maximum sum found so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
