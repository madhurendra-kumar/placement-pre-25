class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long baseSum = 0;
        long totalGain = 0;
        int countPositive = 0;
        int minPositiveGain = Integer.MAX_VALUE;

        for (int num : nums) {
            baseSum += num;
            int xorVal = num ^ k;
            int gain = xorVal - num;

            if (gain > 0) {
                totalGain += gain;
                countPositive++;
                minPositiveGain = Math.min(minPositiveGain, gain);
            } else {
                
                minPositiveGain = Math.min(minPositiveGain, -gain);
            }
        }

    





        if (countPositive % 2 == 1) {
            totalGain -= minPositiveGain;
        }

        return baseSum + totalGain;
    }
}