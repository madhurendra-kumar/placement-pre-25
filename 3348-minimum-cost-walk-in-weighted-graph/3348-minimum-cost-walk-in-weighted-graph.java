import java.util.*;

class Solution {
    class Pair {
        int node, wt;
        Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public int[] minimumCost(int n, int[][] edges, int[][] queries) {
        int[] ans = new int[queries.length];
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adj.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        
        int[] parent = new int[n];
        int[] minEdgeWeight = new int[n];
        Arrays.fill(minEdgeWeight, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) parent[i] = i;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                minEdgeWeight[i] = Integer.MAX_VALUE;
                dfsIterative(adj, i, parent, minEdgeWeight, visited);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0], t = queries[i][1];
            if (s == t) {
                ans[i] = 0;
            } else if (find(s, parent) == find(t, parent)) {
                ans[i] = minEdgeWeight[find(s, parent)];
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }

    private void dfsIterative(List<List<Pair>> adj, int start, int[] parent, int[] minEdgeWeight, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        int root = start;
        int minWeight = Integer.MAX_VALUE;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            parent[node] = root; 

            for (Pair neighbor : adj.get(node)) {
                minWeight &= neighbor.wt;
                if (!visited[neighbor.node]) {
                    visited[neighbor.node] = true;
                    stack.push(neighbor.node);
                }
            }
        }

        minEdgeWeight[root] = minWeight;
    }

    private int find(int x, int[] parent) {
        if (parent[x] != x) {
            parent[x] = find(parent[x], parent);  
        }
        return parent[x];
    }
}