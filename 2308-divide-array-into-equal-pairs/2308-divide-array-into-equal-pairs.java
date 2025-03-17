class Solution {
    public boolean divideArray(int[] nums) {
        int length=nums.length;
        int div1=0, div2=0;
        for(int i=0;i<length;i++){
            div1=nums[i]^div1;
            div2=(nums[i]+1)^div2;
        }
        return div1==0 && div2==0;
        
    }
}