class Solution {
    public int minFlips(String s) {

        int n = s.length();
        s = s + s;

        int flip1 = 0;
        int flip2 = 0;
        int result = Integer.MAX_VALUE;

        int i = 0;

        for(int j = 0; j < 2 * n; j++) {

            char exp1 = (j % 2 == 0) ? '0' : '1';
            char exp2 = (j % 2 == 0) ? '1' : '0';

            if(s.charAt(j) != exp1) flip1++;
            if(s.charAt(j) != exp2) flip2++;

            if(j - i + 1 > n) {

                char prev1 = (i % 2 == 0) ? '0' : '1';
                char prev2 = (i % 2 == 0) ? '1' : '0';

                if(s.charAt(i) != prev1) flip1--;
                if(s.charAt(i) != prev2) flip2--;

                i++;
            }

            if(j - i + 1 == n) {
                result = Math.min(result, Math.min(flip1, flip2));
            }
        }

        return result;
    }
}