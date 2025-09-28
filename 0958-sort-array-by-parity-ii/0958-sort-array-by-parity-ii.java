class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int odd[]=new int[n/2];
        int even[]=new int[n/2];
        int i=0,j=0;
        for(int num:nums){
            if(num%2==0){
                even[i++]=num;
            }
            else odd[j++]=num;
        }
        i=0;j=0;
        for(int k=0;k<n;k+=2){
            nums[k]=even[i++];
            nums[k+1]=odd[j++];
        }
        return nums;
    }
}