

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n]; // Count of meetings per room

        // Sort meetings by their start time
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        // Available rooms by room index (min-heap)
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableRooms.offer(i);
        }

        // Busy rooms: [endTime, roomIndex] (min-heap)
        PriorityQueue<long[]> busyRooms = new PriorityQueue<>((a, b) -> 
            a[0] != b[0] ? Long.compare(a[0], b[0]) : Integer.compare((int)a[1], (int)b[1])
        );

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            int duration = end - start;

            // Free rooms whose meetings have ended
            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start) {
                int room = (int) busyRooms.poll()[1];
                availableRooms.offer(room);
            }

            if (!availableRooms.isEmpty()) {
                int room = availableRooms.poll();
                busyRooms.offer(new long[]{end, room});
                count[room]++;
            } else {
                // Delay the meeting until the earliest room is free
                long[] earliest = busyRooms.poll();
                long newEnd = earliest[0] + duration;
                int room = (int) earliest[1];
                busyRooms.offer(new long[]{newEnd, room});
                count[room]++;
            }
        }

        // Find the room with the most meetings
        int maxCount = 0, result = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            }
        }
        return result;
    }
}