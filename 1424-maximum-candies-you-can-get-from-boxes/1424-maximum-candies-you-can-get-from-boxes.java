class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
         int n = status.length;
        boolean[] hasKey = new boolean[n];
        boolean[] boxOwned = new boolean[n];
        boolean[] boxVisited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        for (int box : initialBoxes) {
            boxOwned[box] = true;
            queue.offer(box);
        }

        int totalCandies = 0;

        boolean progress = true;
        while (progress) {
            progress = false;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int box = queue.poll();
                if (!boxVisited[box] && (status[box] == 1 || hasKey[box])) {
                    boxVisited[box] = true;
                    progress = true;

                    totalCandies += candies[box];

                    for (int key : keys[box]) {
                        hasKey[key] = true;
                        if (boxOwned[key] && !boxVisited[key]) {
                            queue.offer(key);
                        }
                    }

                    for (int contained : containedBoxes[box]) {
                        boxOwned[contained] = true;
                        queue.offer(contained);
                    }
                } else {
                    queue.offer(box);
                }
            }
        }

        return totalCandies;
    }
}