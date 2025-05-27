class Solution {
    public int differenceOfSums(int n, int m) {
        int totalsum=n*(n+1)/2;
        int divsum=m*(n/m)*(n/m+1);
        return totalsum-divsum;
        
    }
}