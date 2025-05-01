class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        int low=0;
        int high=tasks.length-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,tasks,workers,pills,strength)){
                ans=mid+1;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
    }
    public boolean check(int j,int[] tasks,int[] workers,int pills,int strength){
       
        TreeMap<Integer, Integer> mapping = new TreeMap<>();
        for(int i: workers){mapping.put(i, mapping.getOrDefault(i, 0)+1);}
        for(int i = j; i >= 0; i--){
            Integer key = mapping.ceilingKey(tasks[i]);
            if(key != null){
                mapping.put(key, mapping.get(key)-1);
                if(mapping.get(key) <= 0){mapping.remove(key);}
            }
            else{
                Integer key2 = mapping.ceilingKey(tasks[i]-strength);
                if(key2 != null && pills > 0){
                    mapping.put(key2, mapping.get(key2)-1);
                    if(mapping.get(key2) <= 0){mapping.remove(key2);}
                    pills--;
                }
                else{return false;}
            }
        }
        return true;

    }
}