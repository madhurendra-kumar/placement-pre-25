class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums.get(i);
            int b=a+1;
            if(a==2){
                arr[i]=-1;
            }
            else{
                arr[i]= a-((b)&(-b))/2;
            }
        }
        return arr;
    }
}