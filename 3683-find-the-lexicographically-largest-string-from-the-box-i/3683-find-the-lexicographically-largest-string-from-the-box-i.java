class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int n=word.length();
        String ans="";
        int len=n-(numFriends-1);
        for(int i=0;i<n;i++){
            String newWord=word.substring(i, Math.min(i+len, n));
            if(ans.compareTo(newWord)< 0) ans= newWord;
        }
        return ans;
        
    }
}