class Solution {
    public int triangleNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n-1; i > 0; i--){
            int j = i-1; 
            int k = 0;
            while(j > k){
                if(nums[j] + nums[k] > nums[i]){
                    res = res + (j - k);
                    j--;
                }else{
                    k++;
                }
            }
        }
        return res;
    }
}