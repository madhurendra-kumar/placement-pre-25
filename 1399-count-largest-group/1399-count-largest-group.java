class Solution {
    public int countLargestGroup(int n) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=n;i++){
            int digits = sumDigit(i);
            map.put(digits, map.getOrDefault(digits, 0)+1);
        }
        int maxGroup = 0;
        for(int v : map.values()){
            maxGroup = Math.max(maxGroup, v);
        }
        for(int v : map.values()){
            if(v == maxGroup){
                res++;
            }
        }
        
        return res;
    }
    private int sumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n = n /10;
        }
        return sum;
    }
}