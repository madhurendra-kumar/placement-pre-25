class Solution {
    public int rob(int[] nums) {
        int [] total_loot= new int[nums.length];
        if(nums.length<2) return nums[0];
        total_loot[0]= nums[0];
        total_loot[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            total_loot[i]=Math.max(total_loot[i-2]+nums[i],total_loot[i-1]);
        }

    return total_loot[nums.length-1];
    }
}