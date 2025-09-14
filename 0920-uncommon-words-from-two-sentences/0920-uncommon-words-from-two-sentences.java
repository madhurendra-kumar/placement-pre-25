class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> set = new HashSet<>();
        Set<String> dupSet = new HashSet<>();

        for (String s : s1.split(" ")) {
            if (!dupSet.contains(s)) {
                if (set.contains(s)) {
                    set.remove(s);
                    dupSet.add(s);
                } else {
                    set.add(s);
                }
            }
        }

        for (String s : s2.split(" ")) {
            if (!dupSet.contains(s)) {
                if (set.contains(s)) {
                    set.remove(s);
                    dupSet.add(s);
                } else {
                    set.add(s);
                }
            }
        }

        return set.toArray(new String[0]);
    }
}