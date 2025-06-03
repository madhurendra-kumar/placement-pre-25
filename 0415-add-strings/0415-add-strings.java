class Solution {
    public String addStrings(String num1, String num2) {
        java.math.BigInteger a= new java.math.BigInteger(num1);
        java.math.BigInteger b= new java.math.BigInteger(num2);
        a=a.add(b);
        return a.toString();

        
    }
}