class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> mp = new HashMap<>();
        String[] res = new String[score.length];

        for(int i=0; i<score.length; i++){
           mp.put(score[i],i);
        }
        Arrays.sort(score);

        for(int i=score.length-1; i>=0; i--){
            int rank = score.length - i;
            if(rank == 1) res[mp.get(score[i])] = "Gold Medal";
            else if(rank == 2) res[mp.get(score[i])] = "Silver Medal";
            else if(rank == 3) res[mp.get(score[i])] = "Bronze Medal";
            else{
                res[mp.get(score[i])] = Integer.toString(rank);
            }
        }
        return res;
    }
}