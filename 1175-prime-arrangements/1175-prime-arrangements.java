class Solution {
    public int numPrimeArrangements(int n) {
        int nonPrime=1;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++)
        {
            for(int j=i*2;j<=n;j+=i)
            {
                if(arr[j]==true)
                {
                    arr[j]=false;
                    nonPrime++;
                }
            }
        }
        long res=1;
        int prime=n-nonPrime;
        for(int i=prime;i>0;i--)
        {
            res*=i;
            res%=1000000007;
        }
        for(int i=nonPrime;i>0;i--)
        {
            res*=i;
            res%=1000000007;
        }
        return (int)res;
    }
}