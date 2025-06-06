class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)) {
                i++;
                j++;
            } else j++;
        }
        return i==m;
        
    }
}