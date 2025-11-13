class Solution {
    public int maxNumberOfBalloons(String text) {
        int len=text.length();
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;

        for(char c:text.toCharArray()){
            if(c=='b')b++;
            else if(c=='a')a++;
            else if(c=='o')o++;
            else if(c=='l')l++;
            else if(c=='n')n++;
        }
        l/=2;
        o/=2;
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
        
        
    }
}