class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(bobSizes);
        int aliceSum=1;
        int bobSum=1;
        for(int i=0;i<aliceSizes.length;i++){
            aliceSum+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            bobSum+=bobSizes[i];
        }
        int[] ans=new int[2];
        for(int i=0;i<aliceSizes.length;i++){
            if((bobSum-aliceSum+(2*aliceSizes[i]))%2!=0){
                break;
            }
            if(Arrays.binarySearch(bobSizes,(bobSum-aliceSum+(2*aliceSizes[i]))/2)>=0){
                ans[0]=aliceSizes[i];
                ans[1]=(bobSum-aliceSum+(2*aliceSizes[i]))/2;
            }
            else if(aliceSizes[i]==(bobSum-aliceSum+(2*aliceSizes[i]))/2){
                ans[0]=aliceSizes[i];
            }
        }
        return ans;
    
        
    }
}