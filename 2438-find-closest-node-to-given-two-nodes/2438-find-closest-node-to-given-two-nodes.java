class Solution {
   
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        int[] dist1=new int[n];
        int[] dist2=new int[n];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        dfs(node1, 0, edges, new boolean[n], dist1);
        dfs(node2, 0, edges, new boolean[n], dist2);

        int ans=-1;
        int minOfMaxVal=(int)1e9;
        for(int i=0;i<n;i++){
            if(dist1[i]!=-1 && dist2[i]!=-1){
                int max=Math.max(dist1[i], dist2[i]);
                if(max<minOfMaxVal){
                   minOfMaxVal=max;
                   ans=i;
                }
            }
        }
        return ans;
    }
    public void dfs(int node, int dist, int[] edges, boolean[] visited, int[] distArr){
        if(visited[node])return;

        visited[node]=true;
        distArr[node]=dist;

        if(edges[node]!=-1){
            dfs(edges[node], dist+1, edges, visited, distArr);
        }

        return;
    }
    
}