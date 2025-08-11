class Solution {
    public String reverseStr(String s, int k) {
     char[] c = s.toCharArray();
     int left;
     int right;
     char temp;
     for(int i = 0;i<c.length;i=i+2*k){
        left = i;
            right = Math.min(i+k-1,c.length-1);
        while(left < right){
            
            temp = c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        
     } 
         return s = new String(c);
    }
}