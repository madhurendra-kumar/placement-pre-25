class Solution {
    public String sortVowels(String s) {
        int n= s.length();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if("aeiouAEIOU".contains(String.valueOf(s.charAt(i))))
                list.add(s.charAt(i));
        }

        if(list.size()<=0) return s;
        Collections.sort(list);
        int k=0;

        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if("aeiouAEIOU".contains(String.valueOf(s.charAt(i))))
                sb.append(list.get(k++));
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}