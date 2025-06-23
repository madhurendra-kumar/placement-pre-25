class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int len = 1;

        while (count < n) {
            // Generate palindromes of current length
            for (long i : generatePalindromes(len)) {
                String baseK = toBaseK(i, k);
                if (isPalindrome(baseK)) {
                    sum += i;
                    count++;
                    if (count == n) return sum;
                }
            }
            len++;
        }

        return sum;
    }

    // Generate palindromes of given digit length
    private List<Long> generatePalindromes(int length) {
        List<Long> res = new ArrayList<>();

        int half = (length + 1) / 2;
        long start = (long)Math.pow(10, half - 1);
        long end = (long)Math.pow(10, half);

        for (long i = start; i < end; i++) {
            String left = Long.toString(i);
            String right = new StringBuilder(left.substring(0, length % 2 == 0 ? left.length() : left.length() - 1)).reverse().toString();
            res.add(Long.parseLong(left + right));
        }

        return res;
    }

    // Convert number to base-k
    private String toBaseK(long num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.reverse().toString();
    }

    // Check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}