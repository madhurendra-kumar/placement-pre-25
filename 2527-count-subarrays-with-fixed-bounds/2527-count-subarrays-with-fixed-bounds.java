class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long result = 0;
        int prevMin = -1, prevMax = -1, invalid = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                invalid = i;

            if (nums[i] == minK)
                prevMin = i;

            if (nums[i] == maxK)
                prevMax = i;

            result += Math.max(0, Math.min(prevMin, prevMax) - invalid);
        }

        return result;
    }
}