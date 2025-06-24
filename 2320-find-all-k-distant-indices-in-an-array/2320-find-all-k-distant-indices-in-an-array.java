class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> indices = new HashSet<>();
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == key) {
                int from = Math.max(i-k , 0);
                int till = Math.min(i+k , nums.length-1);
                for(int j = from; j<=till; j++) {
                    indices.add(j);
                }
            }
        }
        List<Integer> ans = new ArrayList<>(indices);
        Collections.sort(ans);
        return ans;
    }
}