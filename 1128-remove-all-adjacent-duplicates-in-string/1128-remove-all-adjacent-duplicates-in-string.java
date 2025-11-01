class Solution {
    public String removeDuplicates(String s) {
        char[] chars=new char[s.length()];
        int index=0;
        for(char ch: s.toCharArray()){
            if(index==0 || chars[index-1]!=ch){
                chars[index++]=ch;
            }else{
                index--;
            }
        }
        return new String(chars,0,index);
        
    }
}