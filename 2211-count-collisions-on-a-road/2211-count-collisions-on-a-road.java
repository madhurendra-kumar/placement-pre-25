class Solution {
    public int countCollisions(String s) {
        int count = 0;
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(st.size()==0 || ch=='R'){
                st.push(ch);
            }
            else {
                while(st.size()>0){
                    if(ch=='L' && st.peek()=='R'){
                        count+=2;
                        st.pop();
                        ch = 'S';
                    }
                    else if(ch=='L' && st.peek()=='S'){
                        count += 1;
                        ch = 'S';
                        break;
                    }
                    else if(ch=='S' && st.peek()=='R'){
                        count += 1;
                        st.pop();
                    }
                    else{
                        break;
                    }
                }
                st.push(ch);
            }
        }
        return count;
    }
}