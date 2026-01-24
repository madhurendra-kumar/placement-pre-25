class Solution {
    public int minPairSum(int[] nums) {
        int minMax = 1;

        for(int n:nums){
            minMax = Math.max(n,minMax);
        }

        int[] arr = new int[minMax+1];
        for(int n:nums){
            arr[n]++;
        }

        int l = 0, r = minMax, ans = 0;
        while (l < r) {
            while (arr[l] == 0)
                l++;
            while (arr[r] == 0)
                r--;
            ans = Math.max(ans, l + r);
            if (arr[r] > arr[l])
                arr[r] -= arr[l++];
            else if (arr[l] > arr[r])
                arr[l] -= arr[r--];
            else {
                l++;
                r--;
            }
        }

        return ans;
    }
}