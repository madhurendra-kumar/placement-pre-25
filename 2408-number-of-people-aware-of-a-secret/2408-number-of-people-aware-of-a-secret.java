class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int[] gainLine=new int[n+forget+1];
        int[] forgetLine=new int[n+forget+1];
        int mod=(int)Math.pow(10,9)+7;

        gainLine[delay]++;
        forgetLine[forget]++;

        int totalGain=1;
        int add=0;
        int totalForget=0;
        for(int i=delay;i<n;i++){
            add+=(gainLine[i]-forgetLine[i])%mod;
            add%=mod;
            add=(add+mod)%mod;
            totalGain+=add;
            totalGain%=mod;

            totalForget+=forgetLine[i];
            totalForget%=mod;
            
            gainLine[i+delay]+=add;
            gainLine[i+delay]%=mod;

            forgetLine[i+forget]+=add;
            forgetLine[i+forget]%=mod;
        }
        totalGain-=totalForget;
        totalGain=(totalGain+mod)%mod;
        return totalGain;
        
    }
}