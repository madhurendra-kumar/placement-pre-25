class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int temp=0;
        String res="";
        Map<String,Integer>map=new HashMap();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String arr[]= paragraph.split("\\s+");
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String k: map.keySet()){
            if(map.get(k)>temp&&!bannedSet.contains(k)){
                System.out.println(res);
                res = k;
                temp=map.get(k);
            }
        }
        System.out.println(res);
        return res;
    }
}