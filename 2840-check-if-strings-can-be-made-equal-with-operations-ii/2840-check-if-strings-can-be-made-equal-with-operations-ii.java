class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] odd = new int[26];
        int[] eve = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            if(i%2==0) eve[s1.charAt(i)-'a']++;
            else odd[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            if(i%2==0)
            {
                if(eve[s2.charAt(i)-'a']==0) return false; 
                eve[s2.charAt(i)-'a']--;
            } 
            else
            {
                if(odd[s2.charAt(i)-'a']==0) return false;
                odd[s2.charAt(i)-'a']--;
            }  
        }
        return true;
    }
//please upvote...
}