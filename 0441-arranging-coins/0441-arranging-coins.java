class Solution {
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int count = 0;
        int i = 1;
        while (n != 0) {
            if (n >= i) {
                n -= i;
                count++;
                i++;
            } 
            else {
                break;
            }
        }
        return count;
    }
}