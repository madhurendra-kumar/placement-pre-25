class Solution {
    public int numberOfSubstrings(String s) {
        int output = 0;
        int prefix[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(i == 0) prefix[i] = (s.charAt(i) == '1')? 1:0;
            else prefix[i] = prefix[i-1] + ((s.charAt(i) == '1')? 1:0);
        }
        for(int i=0;i<s.length();i++){
            int count = 0,one = 0;
            for(int j=i;j<s.length();j++){
                one = prefix[j]-((i == 0)?0:prefix[i-1]); 
                count = j-i+1-one;  
                if(count*count > one)  j+=((count*count)-one-1);  
                if(count*count <= one) {
                    int kl = (int)Math.sqrt(one);
                    output++;
                    if(kl>count){  
                        output += (j+(kl-count))>=s.length()?(s.length()-j-1):(kl-count); 
                        j = j+(kl-count);
                    }
                }
            }
        }
        return output;
    }
}