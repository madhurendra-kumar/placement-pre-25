class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 0;
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
           
            int adder = (i == n - 1) ? 1 : 0;
            sum = digits[i] + adder + carry;

           
            if (sum <= 9) {
                digits[i] = sum;
                return digits;
            }

            
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        
        if (carry != 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            return newDigits;
        }

        return digits;
    }
}