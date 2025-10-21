class Solution {
    public int lastStoneWeight(int[] stones) {

        int lastIdx = stones.length - 1;

        if (lastIdx == 0) {
            return stones[lastIdx];
        }

        Arrays.sort(stones);

        while (true) {

            int last = stones[lastIdx];
            int beforeLast = stones[lastIdx - 1];

            if (beforeLast == 0) {

                return last;
            } else if (last == beforeLast) {

                stones[lastIdx] = 0;
                stones[lastIdx - 1] = 0;
            } else {

                stones[lastIdx] = last - beforeLast;
                stones[lastIdx - 1] = 0;
            }

            Arrays.sort(stones);
        }
    }
}