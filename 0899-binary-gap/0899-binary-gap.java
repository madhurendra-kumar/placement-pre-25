class Solution {
    public int binaryGap(int n) {
        String bit = Integer.toBinaryString(n);

        int last = -1;
        int max = 0;

        for (int i = 0; i < bit.length(); i++) {
            char c = bit.charAt(i);

            if (c == '1') {
                if (last != -1) {
                    int gap = i - last;
                    if (gap > max) {
                        max = gap;
                    }
                }
                last = i;
            }
        }
        return max;
    }
}