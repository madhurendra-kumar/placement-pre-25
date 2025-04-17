class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        solve(nums, used, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int[] nums, boolean[] used,  List<Integer> tempList, List<List<Integer>> ans){
        if(tempList.size() == nums.length){
            ans.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i] || (i > 0 && nums[i] == nums[i-1] && used[i-1])) continue;
            tempList.add(nums[i]);
            used[i] = true;
            solve(nums, used, tempList, ans);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}