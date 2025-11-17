class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] nums=new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i]=i+1;
        }
        helper(res, list, nums, 0, k); 
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int i, int k)
    {
        if(list.size()==k)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(i==nums.length)
        {
            return;
        }
        list.add(nums[i]);
        helper(res, list, nums, ++i, k);
        list.remove(list.size()-1);
        --i;
        helper(res, list, nums, ++i, k);
        return;
    }
}