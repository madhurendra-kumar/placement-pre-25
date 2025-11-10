class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start == destination) {
            return 0;
        }

        int total = 0;
        int clockwise = 0;

        for (int d : distance) {
            total += d;
        }

        for (int i = start; i != destination; i = (i + 1) % distance.length) {
            clockwise += distance[i];
        }

        return Math.min(clockwise, total - clockwise);
    }
}