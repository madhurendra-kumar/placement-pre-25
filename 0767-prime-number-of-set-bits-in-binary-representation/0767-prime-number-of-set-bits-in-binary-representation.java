class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer> arr=List.of(2,3,5,7,11,13,17,19);
        int count=0;
        for(int i=left;i<=right;i++){
            if(arr.contains(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
        

    }
}