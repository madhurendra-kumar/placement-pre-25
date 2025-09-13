class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxC = 0;
        int maxV = 0;
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(key =='a' || key == 'e'|| key == 'i'|| key == 'o'|| key == 'u'){
                if(value>maxV){
                    maxV = value;
                }
            }else{
                if(value>maxC){
                    maxC = value;
                }
            }
        }
        return maxC + maxV;
    }
}