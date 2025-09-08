class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int flbx=rec1[0];
        int flby=rec1[1];
        int frtx=rec1[2];
        int frty=rec1[3];

        int slbx=rec2[0];
        int slby=rec2[1];
        int srtx=rec2[2];
        int srty=rec2[3];

        if(flbx<srtx&&flby<srty&&frtx>slbx&&frty>slbty){
            return true;
        }
        else{
            return false;
        }
        
    }
}