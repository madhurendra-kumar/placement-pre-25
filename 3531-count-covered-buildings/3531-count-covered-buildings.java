class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int len = buildings.length;

        Arrays.sort(buildings, (a,b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        
        int[] downy = new int[n+1];
        int[] upy = new int[n+1];

        for(int[] d : buildings){
            int x = d[1];
            int y = d[1];

            upy[y]++;
        }

        int prevx = -1;
        // int prevy = -1;
        int count = 0;

        for(int i = 0; i < len-1; i++){
            int currx = buildings[i][0];
            int curry = buildings[i][1];
            int nextx = buildings[i+1][0];
            upy[curry]--;

            if(currx == prevx && currx == nextx){
                if(downy[curry] > 0 && upy[curry] > 0) count++;
            }
            downy[curry]++;
            prevx = currx;
        }

        return count;
    }
}