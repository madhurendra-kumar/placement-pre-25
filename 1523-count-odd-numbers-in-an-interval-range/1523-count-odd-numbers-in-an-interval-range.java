class Solution {
    public int countOdds(int low, int high) {
        int total=high-low+1;
        int count=total/2;
        if(low%2==1&&high%2==1)count++;
        return count;
        
    }
}