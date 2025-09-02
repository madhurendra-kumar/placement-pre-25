class Solution {
    public String toGoatLatin(String sentence) {
        sentence.toLowerCase();
        String[] words=sentence.split(" ",0);
        int i=1;
        String ans="";
        for(String word:words){
           
            char p1=word.charAt(0);
            char p=word.toLowerCase().charAt(0);
            String k="";
            if(p=='a'||p=='i'||p=='o'||p=='e'||p=='u'){
                k+=word+"ma";
            }
            else{
                k+=word.substring(1,word.length());
                k+=p1;
                k+="ma";
            }
            for(int m=0;m<i;m++){
               k+='a';
            }
            ans+=k;
            if(i!=words.length)ans+=" ";
            i++;
        }
        return ans;
    }
}