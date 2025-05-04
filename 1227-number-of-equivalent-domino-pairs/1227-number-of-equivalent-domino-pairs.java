public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();

        for (int[] d : dominoes) {
            int a = d[0], b = d[1];
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            String key = a + "," + b;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int result = 0;
        for (int freq : map.values()) {
            result += freq * (freq - 1) / 2;
        }

        return result;
    }
}
