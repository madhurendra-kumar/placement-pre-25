class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cnt = 1, maxLength = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				cnt++;
				maxLength = Math.max(maxLength, cnt);
			} else {
				cnt = 1;
			}
		}
		return maxLength;
    }
}