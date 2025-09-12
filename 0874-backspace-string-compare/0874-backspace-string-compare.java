class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Character>list1 = new ArrayList<>();
        List<Character>list2 = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c=='#'){
                if(!list1.isEmpty()){
                    list1.remove(list1.size()-1);
                }
                
            }
            else{
                list1.add(c);
            }
        }

        for(char c : t.toCharArray()){
            if(c=='#'){
                if(!list2.isEmpty()){
                    list2.remove(list2.size()-1);
                }
                
            }
            else{
                list2.add(c);
            }
        }

        return list1.equals(list2);
    }
}