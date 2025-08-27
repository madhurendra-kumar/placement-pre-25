class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-1;
        int index=1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                index=i;
            }else if(smax<nums[i]){
                smax=nums[i];
            }
        }
        if(smax*2<=max){
            return index;
        }else{
            return -1;
        }
    }
}