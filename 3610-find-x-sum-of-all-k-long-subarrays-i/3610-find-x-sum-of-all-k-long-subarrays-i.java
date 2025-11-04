class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] freq = new int[51];  
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Arrays.fill(freq, 0);

            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            List<int[]> freqList = new ArrayList<>();
            for (int value = 0; value < 51; value++) {
                if (freq[value] > 0) {
                    freqList.add(new int[]{value, freq[value]});
                }
            }
            freqList.sort((a, b) -> {
                if (b[1] == a[1]) {     
                    return b[0] - a[0];
                }
                return b[1] - a[1];      
            });

            int xSum = 0;
            int count = 0;
            for (int[] pair : freqList) {
                if (count == x) break;
                xSum += pair[0] * pair[1];  
                count++;
            }

            ans[i] = xSum;
        }

        return ans;
    }
}