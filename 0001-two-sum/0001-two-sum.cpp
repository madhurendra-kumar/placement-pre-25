class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n= nums.size();
        unordered_map<int, int> m;
        for (int i=0; i<n; i++){
            int find_me= target-nums[i];
            if (m.count(find_me)){
                return {m[find_me], i};
                
            }
            m[nums[i]]=i;
        }
        return {};
    }    
    
};