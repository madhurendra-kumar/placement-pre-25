class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder(s.length());
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;
                if(count>1){
                    sb.append(ch);
                }

            }else{
                if(count>1){
                    sb.append(ch);
                }
                count--;
            }
        }
        return sb.toString();
        
    }
}