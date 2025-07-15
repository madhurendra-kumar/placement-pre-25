class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        word = word.toLowerCase();
        boolean vowel = false, conso = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '@' || ch == '$' || ch == '#')
                return false;
            if (!vowel && "aeiou".indexOf(ch) != -1)
                vowel = true;
            else if (!conso && Character.isLetter(ch) && "aeiou".indexOf(ch) == -1)
                conso = true;
        }
        return vowel && conso;
    }
}