class RecentCounter {
    private int low, high, arr[];

    public RecentCounter() {
        arr = new int[10000];
        low = high = 0;
    }

    public int ping(int t) {
        arr[high++] = t;
        while (arr[high - 1] - 3000 > arr[low])
            low++;
        return high - low;
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */