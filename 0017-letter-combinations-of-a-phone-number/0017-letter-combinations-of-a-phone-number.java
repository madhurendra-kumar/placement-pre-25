class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ansList = new ArrayList<>();
        String combi = "";

        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits == null || digits.isEmpty()) return ansList;
        findCombination(digits, ansList, 0, combi, arr);
        return ansList;
    }

    private void findCombination(String digits, List<String> ansList, int index, String combi, String[] arr){
        if(combi.length() == digits.length()){
            ansList.add(combi);
            return;
        }
           String str = arr[digits.charAt(index) - '0'];

        for(int i=0; i < str.length(); i++){
            findCombination(digits, ansList, index + 1, combi + str.charAt(i), arr);
        }
    }
}