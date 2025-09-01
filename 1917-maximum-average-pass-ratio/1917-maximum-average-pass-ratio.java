class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        Queue<double[]> queue = new PriorityQueue<>(
                Comparator.comparingDouble((double[] a) -> a[0]).reversed());
        for (int[] aClass : classes) {
            double pass = aClass[0];
            double total = aClass[1];
            queue.add(produceMargin(pass, total));
        }
        while (extraStudents > 0) {
            double[] poll = queue.remove();
            double pass = poll[1] + 1;
            double total = poll[2] + 1;
            queue.add(produceMargin(pass, total));
            extraStudents--;
        }
        double sum = 0;
        for (double[] doubles : queue) {
            sum += doubles[1] / doubles[2];
        }
        return sum / classes.length;
    }
    public double[] produceMargin(double pass, double total) {
        return new double[]{((pass + 1) / (total + 1)) - (pass / total), pass, total};
    }
}