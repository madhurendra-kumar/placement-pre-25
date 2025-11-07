class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        
        
        long[] powerDiff = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n, i + r + 1);
            powerDiff[left] += stations[i];
            powerDiff[right] -= stations[i];
        }
        
        
        long minInitial = Arrays.stream(stations).min().getAsInt();
        long maxPossible = Arrays.stream(stations).asLongStream().sum() + k;
        long result = 1;
        
        while (minInitial <= maxPossible) {
            long mid = minInitial + (maxPossible - minInitial) / 2;
            
            if (isFeasible(powerDiff.clone(), mid, r, k)) {
                result = mid;
                minInitial = mid +1; 
            } else {
                maxPossible = mid - 1; 
            }
        }
        
        return result;
    }
    
    private boolean isFeasible(long[] powerDiff, long targetMin, int r, int k) {
        int n = powerDiff.length - 1;
        long currentPower = 0;
        long stationsUsed = 0;
        
        for (int i = 0; i < n; i++) {
            
            currentPower += powerDiff[i];
            
            
            if (currentPower < targetMin) {
                long additionalNeeded = targetMin - currentPower;
                
                
                if (stationsUsed + additionalNeeded > k) {
                    return false;
                }
                
                stationsUsed += additionalNeeded;
                
                
                int stationPos = Math.min(n, i + 2 * r + 1);
                powerDiff[stationPos] -= additionalNeeded;
        
                currentPower += additionalNeeded;
            }
        }
        
        return true;
    }
}