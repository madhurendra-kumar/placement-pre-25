class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p=='A'){
                a++;
                l=0;
                if(a>=2)
                    return false;
            }
            if(p=='P')
                l=0;
            
            if(p=='L'){
                l++;
                if(l>=3)
                   return false;
            }
        }
        return true;
    }
}