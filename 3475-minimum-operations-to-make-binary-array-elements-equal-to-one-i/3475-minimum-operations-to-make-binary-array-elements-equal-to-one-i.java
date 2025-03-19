class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int minCnt=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){                
                if(flipThreeNums(nums, i, n)==false){                    
                    return -1;
                }
                minCnt++;
            }            
        }

        return minCnt;
    }

    boolean flipThreeNums(int[] nums, int idx, int n){
        if(idx+2>=n) return false;
        for(int i=idx; i<=idx+2 && i<n; i++){
            nums[i]^=1;
        }
        return true;
    }
}