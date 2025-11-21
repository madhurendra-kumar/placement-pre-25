class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length() ; i++){
            set.add(s.charAt(i));
        }
        int ans = 0;
        for(char ch : set){
            int fi = s.indexOf(ch);
            int li = s.lastIndexOf(ch);
            if(fi!=li){
                HashSet<Character> temp = new HashSet<>();
                for(int i = fi+1 ; i<li ; i++){
                    char ch1 = s.charAt(i);
                    temp.add(ch1);
                }
                ans+= temp.size();
            }
        }

        return ans;
    }
}