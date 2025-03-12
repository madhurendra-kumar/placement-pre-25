class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftProduct=1, rightProduct=1;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<nums.length; i++){
            leftProduct=leftProduct==0 ? 1: leftProduct;
            rightProduct=rightProduct==0?1: rightProduct;

            leftProduct *=nums[i];
            rightProduct*=nums[n-1-i];

            res=Math.max(res, Math.max(leftProduct, rightProduct));
        }
        return res;
    }
}