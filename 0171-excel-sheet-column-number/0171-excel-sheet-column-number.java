class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        int n=columnTitle.length();
        for(int i=0;i<n;i++){
            int c=columnTitle.charAt(i)-'A'+1;
            res=res*26+c;
        }
        
        return res;
        
    }
}