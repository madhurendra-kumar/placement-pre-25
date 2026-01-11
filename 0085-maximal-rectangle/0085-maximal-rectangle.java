class Solution {
    public int maximum(int board[]){
        int n = board.length;
        int pse[] = new int[n];
        int nse[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && board[st.peek()] >= board[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] =-1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && board[st.peek()] > board[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        int max=0;
        for(int i=0; i<n; i++){
            int val = (nse[i] - pse[i]-1) * board[i];
            if(val>0) max = Math.max(max, val);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int board[][] = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==0){
                    if(matrix[i][j]=='0') board[i][j] = 0;
                    else board[i][j] = 1;
                }
                else{
                    if(matrix[i][j]=='1') board[i][j] = 1 + board[i-1][j];
                    else matrix[i][j] = 0;
                }
            }
        }

        int max = 0;
        for(int i=0; i<matrix.length; i++){
            max = Math.max(max, maximum(board[i]));
        }

        return max;
    }
}