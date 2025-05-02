class Solution {
    public int missingNumber(int[] nums) {
        int checksum=0;
        for(int a:nums){
            checksum+=a;

        }
        return sum(nums)-checksum;
        
    }
    public static int sum(int[] nums){
        int sum=0;
        int len=nums.length;
        for(int i=0;i<=len;i++){
            sum+=i;
        }
        return sum;
    }
}