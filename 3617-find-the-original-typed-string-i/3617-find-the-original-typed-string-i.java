class Solution {
    public int possibleStringCount(String s) {
        int n=s.length(),count=1;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        return count;
        
    }
}