/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        binary(root, 0, 0);
        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> res : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : res.values()) {
                while (!pq.isEmpty()) col.add(pq.poll());
            }
            res.add(col);
        }
        return res;
    }

    void binary(TreeNode n, int x, int y) {
        if (n == null) return;
        map.computeIfAbsent(x, a -> new TreeMap<>())
           .computeIfAbsent(y, a -> new PriorityQueue<>()).add(n.val);
        binary(n.left, x - 1, y + 1);
        binary(n.right, x + 1, y + 1);
    }
}

*/
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<int[]>> treeMap = new TreeMap<>();
        dfs(root,0,0,treeMap);

        List<List<Integer>> verticalTrav = new ArrayList<>();
        for(Map.Entry<Integer,List<int[]>> entry : treeMap.entrySet()) {
            List<int[]> nodes = entry.getValue();

            nodes.sort((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

            List<Integer> temp = new ArrayList<>();
            for(int[] pair : nodes) temp.add(pair[1]);
            verticalTrav.add(temp);
        }

        return verticalTrav;
    }
    private void dfs(TreeNode node,int r,int c,TreeMap<Integer,List<int[]>> treeMap) {
        if(node == null) return;

        treeMap.putIfAbsent(c,new ArrayList<>());
        treeMap.get(c).add(new int[]{r,node.val});

        dfs(node.left,r + 1,c - 1,treeMap);
        dfs(node.right,r + 1,c + 1,treeMap);
    }
}
