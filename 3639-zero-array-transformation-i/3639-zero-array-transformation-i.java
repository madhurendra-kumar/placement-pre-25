class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int q[] : queries){
            int l = q[0];
            int r = q[1];
            arr[l]++;
            if(r+1 < n)
                arr[r+1]--;
        }
        boolean flag = arr[0] >= nums[0];
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
            if(arr[i] < nums[i]){
                flag = false;
            }
        }
        return flag;
    }
}