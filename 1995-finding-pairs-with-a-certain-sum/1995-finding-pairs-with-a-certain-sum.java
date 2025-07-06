class FindSumPairs {
    int[] n1;
    int[] n2;
    Map<Integer, Integer> cnt;

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=nums1;
        n2=nums2;
        cnt=new HashMap<>();
        for(int num: nums2){
            cnt.put(num, cnt.getOrDefault(num,0)+1);
        }
        
    }
    
    public void add(int index, int val) {
        int oldVal=n2[index];
        cnt.put(oldVal, cnt.get(oldVal)-1);
        n2[index]+=val;
        cnt.put(n2[index],cnt.getOrDefault(n2[index],0)+1);
        
    }
    
    public int count(int tot) {
        int ans=0;
        for(int num:n1){
            int rest=tot-num;
            ans+=cnt.getOrDefault(rest,0);
        }
        return ans;
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */