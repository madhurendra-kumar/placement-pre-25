class Solution {
    public int maxDifference(String s) {
        int[] alph=new int[26];
        char[] charArray=s.toCharArray();

        for(char ch: charArray){
            alph[ch-'a']++;
        }
        int min_even=100;
        int max_odd=0;
        for(int i:alph){
            if(i%2==0 && i!=0){
                min_even=Math.min(min_even,i);
            }
            else if(i!=0) max_odd=Math.max(max_odd,i);
        }
        return max_odd-min_even;
        
    }
}