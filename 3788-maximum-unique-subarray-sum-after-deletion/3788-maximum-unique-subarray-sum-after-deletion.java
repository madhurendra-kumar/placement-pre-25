class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int negMax = Integer.MIN_VALUE;

        for (int num : nums){
            if(num <= 0){
                negMax = Math.max(negMax , num);
            } else {
                if(set.add(num)){
                    ans += num;
                }
            }
        }

        if (ans == 0) {
            ans = negMax;
        }

        return ans;
    }
}