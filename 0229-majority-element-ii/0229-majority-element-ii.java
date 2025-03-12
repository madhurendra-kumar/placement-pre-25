class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int t=0;
        int n=nums.length;
        List<Integer> v=new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++){
              if(nums[i]==nums[i+1]){
               count++;
            }
           else{
                if(count>n/3){
                 t=nums[i];
                v.add(t);
                }
                 count=1;
            }
        }
        if(count>n/3){
            v.add(nums[n-1]);
        }
        return v;
    }
}
    
    
