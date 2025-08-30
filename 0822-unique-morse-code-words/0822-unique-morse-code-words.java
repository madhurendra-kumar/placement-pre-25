class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> a=new HashSet<>();
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String z:words)
        {
            String t="";
            for(char ch:z.toCharArray())
            {
                t+=s[ch-'a'];

            }
            a.add(t);
        }
return a.size();
        
    }
}