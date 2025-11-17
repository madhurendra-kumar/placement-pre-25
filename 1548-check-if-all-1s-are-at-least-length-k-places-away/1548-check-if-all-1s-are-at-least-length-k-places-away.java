class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=k;
        for(int n:nums){
            if(n==1){
                if(count<k) return false;
                count=0;
            }else{
                count++;
            }
        }
        return true;
        
    }
}