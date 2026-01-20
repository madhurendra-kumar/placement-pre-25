class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        Arrays.fill(ans,-1);

        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i);j++){
                if((j|j+1)==nums.get(i)){
                    ans[i]=j;
                    break;
                }
            }
        } 
        return ans;
    }
}