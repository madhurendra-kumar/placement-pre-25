class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int first = n & 1;
        n = n>>1;
        while(n > 0){
            if((n & 1) == first)return false;
            first = n & 1;
            n >>= 1;
        }
        return true;
    }
}