class Solution {
    public String longestPalindrome(String s) {
  
        char[] chr = s.toCharArray();
        int n = s.length();

        int[] max = new int[3];  

        for (int i = 0; i < n; i++) {
            checkPalindrome(chr, i, i, max);     
            checkPalindrome(chr, i, i + 1, max); 
        }

    return s.substring(max[1],max[2]+1);  

    }

    private void checkPalindrome(char[] chr, int left, int right, int[] max) {

        while (left >= 0 && right < chr.length && chr[left] == chr[right]) {
            left--;
            right++;
        }

        
        left++;
        right--;

        if (right - left + 1 > max[0]) {
            max[0] = right - left + 1;
            max[1] = left;
            max[2] = right;
        }
    }     
    
}