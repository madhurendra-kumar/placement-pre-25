class Solution {
    public String shortestCompletingWord(String l1, String[] words) {
        int cnt[]=new int[27];
        String l=l1.toLowerCase().trim();
        for(int i=0;i<l.length();i++)
        {
            char c=l.charAt(i);
            if(c>='a'&&c<='z')
            cnt[c-'a']++;
        }
        int max=27;
        String ans="";
        for(int i=0;i<words.length;i++)
        {
            int cnt2[]=new int[27];
        for(int j=0;j<words[i].length();j++)
        {
            char c=words[i].charAt(j);
            cnt2[c-'a']++;
        }
        int b=0;
        for(int k=0;k<=26;k++)
        {

            if(cnt[k]>cnt2[k])
            {
             b++;
             break;
            }
        }
        if(b==0)
        {
             if(words[i].length()<max)
             {
                max=words[i].length();
                ans=words[i];
             }
        }
        }
 return ans;
    }
}