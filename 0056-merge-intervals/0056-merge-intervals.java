class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> al = new ArrayList<int[]>();

        for (int i = 0; i < intervals.length; i++) {
            int j = 1;
            while (i+j < intervals.length && intervals[i][1] >= intervals[i+j][0]) {
                intervals[i][1] = Math.max(intervals[i][1], intervals[i+j][1]);
                j++;
            }
            al.add(intervals[i]);
            i+= j-1;
        }

        return al.toArray(new int[0][0]);

    }
}