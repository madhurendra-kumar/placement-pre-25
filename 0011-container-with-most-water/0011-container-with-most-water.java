class Solution {
    public int maxArea(int[] height) {
        return water(height, 0, height.length - 1);
    }

    int water(int[] h, int l, int r) {
        if (l >= r) return 0;
        int area = Math.min(h[l], h[r]) * (r - l);
        return Math.max(area, h[l] < h[r] ? water(h, l + 1, r) : water(h, l, r - 1));
    }
}
