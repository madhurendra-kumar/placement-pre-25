class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                ls.add(i);
            }
        }
        for(int i=0;i<s.length();i++){
            int minn=Integer.MAX_VALUE;
            for(int j=0;j<ls.size();j++){
                minn=Math.min(minn,Math.abs(i-ls.get(j)));
            }
            ans[i]=minn;
        }
        return ans;
        
    }
}