class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for(int i = 0; i < queries.length; i++){
            long st = queries[i][0], end = queries[i][1];
            long totalOps = 0;
            long prev = 1;
            for(int op = 1; op < 17; op++){
                long curr = prev * 4;
                long l = Math.max(st, prev);
                long r = Math.min(end, curr - 1);
                if(r >= l){
                    totalOps += (r - l + 1) * op;
                } 
                prev = curr;
            }
            ans += (totalOps + 1) / 2;
        }
        return ans;
    }
}