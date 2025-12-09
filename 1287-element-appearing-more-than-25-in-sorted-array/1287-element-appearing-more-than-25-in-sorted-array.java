class Solution {
    public int findSpecialInteger(int[] arr) {
        int k=arr.length/4;
        for(int i=0;i<arr.length-k;i++){
            if(arr[i]==arr[i+k]){
                return arr[i];
            }
            
        }
        return -1;
        
    }
}