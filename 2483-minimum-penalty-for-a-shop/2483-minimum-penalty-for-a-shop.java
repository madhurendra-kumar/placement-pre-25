class Solution {
    public int bestClosingTime(String c) {
        int n = c.length();
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        for(int i=1;i<=n;i++) {
            pre[i] = pre[i-1];
            if(c.charAt(i-1)=='N') pre[i]++;
        }
        for(int i=n-1;i>=0;i--){ 
            suf[i] =suf[i+1];
            if(c.charAt(i)=='Y') suf[i]++;
        }
        int ans = Integer.MAX_VALUE, idx = 0;
        for(int i=0;i<=n;i++) {
            int temp = pre[i]+suf[i];
            if(temp<ans) {
                ans = temp;
                idx = i;
            }
        }
        return idx;
    }
}