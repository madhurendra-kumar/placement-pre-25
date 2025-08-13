class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int counter = 1;
        char lastCharacter = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == lastCharacter)
                counter++;
            else {
                list.add(counter);
                lastCharacter = s.charAt(i);
                counter = 1;
            }
        }
        list.add(counter);
        int result = 0;
        for(int i = 0; i < list.size()-1; i++){
             result += Math.min(list.get(i), list.get(i+1));
        }
        return result;


    }
}