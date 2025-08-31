class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int numberOfLines=1;
        int lineInPixels=0;
        for(char ch: s.toCharArray()){
            int width=widths[ch-'a'];
            if(lineInPixels+width>100){
                numberOfLines++;
                lineInPixels=width;
            }else{
                lineInPixels+=width;
            }
        }
        return new int[] {numberOfLines, lineInPixels};
        
    }
}