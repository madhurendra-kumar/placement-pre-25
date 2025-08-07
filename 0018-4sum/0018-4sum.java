class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-1;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int a=j+1,k=nums.length-1;
                while(a<k){
                    long sum=1L*nums[i]+nums[j]+nums[a]+nums[k];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[a],nums[k]);
                        s.add(temp);
                        a++;k--;
                        while(a<k && nums[a]==nums[a-1]) a++;
                        while(a<k && nums[k]==nums[k+1]) k--;
                    }else if(sum<target){
                        a++;
                    }else{
                        k--;
                    }
                }
            }
        }
       return new ArrayList<>(s); 
    }
}