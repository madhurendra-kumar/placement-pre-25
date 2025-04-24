class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length, i = 0, j = 0;
        int total = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        Map<Integer, Integer> map = new HashMap<>();
        int mapSize = 0;
        while(j < n) {
            map.merge(nums[j], 1, Integer::sum);
            mapSize = map.size();
            if(mapSize < total) j++;
            else {
                while(mapSize == total) {
                    count += n - j;
                    if(map.merge(nums[i], -1, Integer::sum) == 0) {
                        map.remove(nums[i]);
                        --mapSize;
                    }
                    ++i;
                }
                ++j;
            } 
        }
        return count;
        
    }
}