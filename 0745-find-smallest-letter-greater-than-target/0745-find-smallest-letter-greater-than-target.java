class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c=letters[0];
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++){
            if(letters[i]<=target){
                continue;
            }else if(letters[i]>target){
                return letters[i];
            }
        }
        return c;
        
    }
}