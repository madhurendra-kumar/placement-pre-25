class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpR=new int[26];
        int[] alpM=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            alpR[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            alpM[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<alpM.length;i++){
            if(alpM[i]<alpR[i]){
                return false;
            }
        }
        return true;
        
    }
}