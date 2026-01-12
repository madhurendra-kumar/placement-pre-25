class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zeroCount=0;
        for(int x:arr){
            if(x!=0){
                if(binarySearch(x*2,arr)){
                    return true;
                }
            }
            else{
                ++zeroCount;
            }
        }
        return zeroCount>=2;
        
    }
    public boolean binarySearch(int x, int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(int)((start+end)/2);
            if(nums[mid]<x){
                start=1+mid;
            }
            else if(nums[mid]>x){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}