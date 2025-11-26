class Solution {
    public int balancedStringSplit(String s) {
        int a=0,b=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                a++;
            }else if(s.charAt(i)=='L'){
                b++;
            }
            if(a==b){
                count++;
            }
        }
        return count;
        
    }
}