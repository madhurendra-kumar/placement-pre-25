class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        long a=num1;
        long b=num2;
        for(int k=0;k<=60;k++){
            long x=a-k*b;
            if(x<k) return -1;
            if(countBits(x)<=k) return k;
        }
        return -1;
        
    }
    int countBits(long num){
        int count=0;
        while(num>0){
            if(num%2==1) count++;
            num/=2;
        }
        return count;
    }
}