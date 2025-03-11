class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // count for 'a', 'b', and 'c'
        int totalSubstrings = 0; // Total number of valid substrings
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                totalSubstrings += (s.length() - right); // Count valid substrings
                count[s.charAt(left) - 'a']--; // Remove left character
                left++; // Move the left pointer
            }
        }

        return totalSubstrings;
    }

    public static void main(String[] args) {
        String s = "abcabc"; // Input string
        Solution sol = new Solution();
        System.out.println("Substrings containing all three characters: " + sol.numberOfSubstrings(s));
    }
}
