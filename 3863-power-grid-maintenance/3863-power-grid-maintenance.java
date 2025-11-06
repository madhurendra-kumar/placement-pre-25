class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();  
        for (int[] connection : connections){
            if (!map.containsKey(connection[0])){
                map.put(connection[0], new ArrayList<>()); 
            }
            if (!map.containsKey(connection[1])){
                map.put(connection[1], new ArrayList<>()); 
            }
            map.get(connection[0]).add(connection[1]); 
            map.get(connection[1]).add(connection[0]); 
        }
        Map<Integer, TreeSet<Integer>> stations = new HashMap<>(); 
        for (int i = 1; i <= c; i++){
            if (visited.contains(i)){
                continue; 
            }
            TreeSet<Integer> set = new TreeSet<>((a, b) -> a - b);
            dfs(i, map, visited, set);
            for (int key : set){
                stations.put(key, set); 
            } 
        }
        int len = 0; 
        for (int[] query : queries){
            if (query[0] == 1){
                len++; 
            }
        }
        int[] res = new int[len];
        int index = 0;  
        for (int[] query : queries){
            if (query[0] == 2){
                stations.get(query[1]).remove(query[1]); 
            } else {
                if (stations.get(query[1]).isEmpty()){
                    res[index++] = -1; 
                } else {
                    if (stations.get(query[1]).contains(query[1])){
                        res[index++] = query[1]; 
                    } else {
                        res[index++] = stations.get(query[1]).first(); 
                    }
                }
            }
        } 
        return res; 
    }

    private void dfs(int station, Map<Integer, List<Integer>> map, Set<Integer> visited, TreeSet<Integer> set){
        set.add(station); 
        visited.add(station);
        if (!map.containsKey(station)){
            return; 
        }
        for (int next : map.get(station)){
            if (visited.contains(next)){
                continue; 
            }
            dfs(next, map, visited, set); 
        }
    }
}