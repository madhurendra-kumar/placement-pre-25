class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        int n = s.length();
        int start = 0;
        while(start<n && s.charAt(start)==' ') {
            start++;
        }
        if(start==n) return 0;
        boolean sign = true;
        if(s.charAt(start)=='-') {
            start++;
            sign = false;
        } else if(s.charAt(start)=='+') {
            start++;
        }
        while(start<n && s.charAt(start)=='0') {
            start++;
        }
        int i = start;
        while(i<n) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                i++;
            } else break;
        }
        int end = i-1;
        long num = 0;
        for(i=start;i<=end;i++) {
            num = (num*10 + (s.charAt(i)-'0'));
            if(num>Integer.MAX_VALUE) {
                if(sign) return Integer.MAX_VALUE;
                return Integer.MIN_VALUE;
            }
        }
        return sign ? (int)num : (int)-num;
    }
}