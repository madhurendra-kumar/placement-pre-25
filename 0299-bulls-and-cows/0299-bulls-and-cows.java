class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;
        int[] sCount=new int[10];
        int[] gCount=new int[10];
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                bulls++;
            }else{
                sCount[s-'0']++;
                gCount[g-'0']++;
            }
             
            
        }
        for(int i=0;i<10;i++){
            cows+=Math.min(sCount[i],gCount[i]);
        }
        return bulls+"A"+cows+ "B";
        
    }
}