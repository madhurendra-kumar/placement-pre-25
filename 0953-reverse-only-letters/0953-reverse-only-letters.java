class Solution {
    public String reverseOnlyLetters(String s){
        char[] chars=s.toCharArray();

        int start=0;
        int end=chars.length-1;
        while(start<end){
            if(!Character.isLetter(chars[start])){
                start++;
            } else if(!Character.isLetter(chars[end])){
                end--;
            } else {
                char tmp=chars[start];
                chars[start]=chars[end];
                chars[end]=tmp;

                start++;
                end--;
            }
        }
        return new String(chars);
    }
}