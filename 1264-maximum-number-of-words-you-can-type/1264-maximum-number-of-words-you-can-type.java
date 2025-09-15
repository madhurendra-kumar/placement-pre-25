
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int broken = 0;
        String[] words = text.split(" ");
        
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (brokenLetters.indexOf(ch) != -1) { 
                    broken++;
                    break; 


                }
            }
        }
        
        return words.length - broken; 
    }
}