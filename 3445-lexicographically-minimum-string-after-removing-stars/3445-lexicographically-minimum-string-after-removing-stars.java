class Solution {
    public String clearStars(String s) {
        List<Stack<Integer>> arr= new ArrayList<>();
        int n = s.length();
        char c[] = s.toCharArray();
        for (int i = 0; i < 26; i++) arr.add(new Stack<>());
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '*'){
                for(int j=0;j<26;j++){
                    if(!arr.get(j).isEmpty()){
                        int ind = arr.get(j).pop();
                        c[ind] = '*';
                        break;
                    }
                }
            }else{
                int x = s.charAt(i) - 'a';
                arr.get(x).push(i);
            }
            
        }
        String ans = "";
        for(char ch : c){
            if(ch == '*') continue;
            ans += ch;
        }
        return ans;
    }
}