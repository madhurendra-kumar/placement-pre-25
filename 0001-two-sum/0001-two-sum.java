class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<> ();
        int[] result = new int[2];
        int n = nums.length;

        for(int i = 0;i <n; i++){

            if(numsMap.containsKey( target - nums[i])){
                result[1] = i;
                result[0]= numsMap.get(target -nums[i]);
                return result;
            }
            numsMap.put(nums[i],i);

            
        }
        return result;
    }
}