class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        for (int i = 0; i < n; i++) {
            if (vis[i] == -1) {
                bfs(i, arr, d, vis);
            }
        }
        int ans = -1;
        for (int i : vis) {
            if (i > ans) {
                ans = i;
            }
        }
        

        return ans;
    }

    public int bfs(int curpos, int[] arr, int d, int[] vis) {
        if (vis[curpos] != -1) {
            return vis[curpos];
        }
        int ans = 0;
        int l = curpos - d;
        int r = curpos + d;
        for (int i = curpos - 1; i >= Math.max(0, l); i--) {
            if (arr[i] >= arr[curpos]) {
                break;
            }
            ans = Math.max(ans, bfs(i, arr, d, vis));
        }
        for (int i = curpos + 1; i <= Math.min(r, arr.length - 1); i++) {
            if (arr[i] >= arr[curpos]) {
                break;
            }
            ans = Math.max(ans, bfs(i, arr, d, vis));
        }
        vis[curpos] = 1 + ans;
        return vis[curpos];
    }
}