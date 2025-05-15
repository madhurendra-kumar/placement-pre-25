class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<String>();
        int previous = 2;
        for(int i = 0; i < groups.length; i++){
            if(previous != groups[i]){
                ans.add(words[i]);
            }
            previous = groups[i];
        }
        return ans;
    }
}