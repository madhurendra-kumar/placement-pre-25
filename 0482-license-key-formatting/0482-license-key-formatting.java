class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int n=s.length();
        int cnt=0;
        String temp="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='-'){
                cnt++;
                temp+=s.charAt(i);
            }
        }
        int first_dash=cnt%k;
        String str="";
        int c=0;
        for(int i=0;i<cnt;i++){
            if(i!=0 && (i==first_dash || c==k)){
                str+='-';
                str+=temp.charAt(i);
                c=0;
            }
            else str=str+temp.charAt(i);
            c++;
        }
        return str.toUpperCase();
        
    }
}