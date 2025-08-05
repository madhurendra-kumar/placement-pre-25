class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int unplaced=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }
                else if(j==n-1){
                    unplaced++;
                }
            }

        }
        return unplaced;
        
    }
}