class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)return nums[nums.length-1];
        int a=1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]-nums[i-1]!=0)a++;
            if(a==3)return nums[i-1];
        }
        return nums[nums.length-1];

    }
}