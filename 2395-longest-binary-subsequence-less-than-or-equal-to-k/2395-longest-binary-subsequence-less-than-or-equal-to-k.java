class Solution {
    public int longestSubsequence(String s, int k) {
        int res = 0;
        long cur = 0;
        for(int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if(c == '0') {
                res++;
            } else if(res < 31 && cur + (1L << res) <= k) {
                cur += 1L << res;
                res++;
            }
        }
        return res;
    }
}