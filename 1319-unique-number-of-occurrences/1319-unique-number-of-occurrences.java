class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        Set<Integer> check = new HashSet<>();
        for (int freq : mp.values()) {
            if (check.contains(freq)) return false;
            check.add(freq);
        }
        return true;
    }
}