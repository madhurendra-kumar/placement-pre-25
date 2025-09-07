class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int cnt=0;
        for(int i=1;i<n;i++){
            ans[i-1]=i;
            cnt+=i;
        }
        ans[n-1]=cnt*(-1);
        return ans;
        
    }
}