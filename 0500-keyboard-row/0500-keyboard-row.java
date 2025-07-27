class Solution {
    public String[] findWords(String[] words) {
        int n=words.length;
        String firstrow="qwertyuiop";
        String secondrow="asdfghjkl";
        String thirdrow="zxcvbnm";
        List<String> result = new ArrayList<>();
        for(String word:words)
       if(canbetyped(word,firstrow) ||canbetyped(word,secondrow) || canbetyped(word,thirdrow)){
        result.add(word); 
       }
         return result.toArray(new String[0]);

    }
    private boolean canbetyped(String word,String row){
         //String lowerRow = row.toLowerCase();
        for (char c : word.toCharArray()) {
            if (row.indexOf(Character.toLowerCase(c)) == -1) {  
                return false;  
            }
        }
        return true; 
    }
}