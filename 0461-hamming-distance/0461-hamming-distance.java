class Solution {
    public int hammingDistance(int x, int y) {
        int res=0;
        int m=x^y;
        while(m!=0){
            if((m&1)==1){
                res++;
            }
            m=m>>1;
        }
        return res;
        
    }
}