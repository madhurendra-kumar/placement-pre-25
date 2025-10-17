class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%3!=0){
            return false;
        }
        sum/=3;
        int subSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            subSum+=arr[i];
            if(subSum==sum){
                count++;
                subSum=0;
                if(count==2 && i<arr.length-1){
                    return true;
                }
            }
        }
        return false;
        
    }
}