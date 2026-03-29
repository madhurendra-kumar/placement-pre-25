class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] even_s1 = {s1.charAt(0), s1.charAt(2)};
        char[] even_s2 = {s2.charAt(0), s2.charAt(2)};
        
        char[] odd_s1 = {s1.charAt(1), s1.charAt(3)};
        char[] odd_s2 = {s2.charAt(1), s2.charAt(3)};
        
        Arrays.sort(even_s1);
        Arrays.sort(even_s2);
        
        Arrays.sort(odd_s1);
        Arrays.sort(odd_s2);
        
        return Arrays.equals(even_s1, even_s2) && Arrays.equals(odd_s1, odd_s2);
    }
}