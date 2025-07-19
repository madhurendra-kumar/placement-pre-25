class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> set = new HashSet<>(Arrays.asList(folder));
        List<String> list = new ArrayList<>();
        for(String f:folder){
            boolean isSub = false;
            String prefix = f;
            while(!prefix.isEmpty()){
                int pos = prefix.lastIndexOf('/');
                if(pos == -1)break;
                prefix = prefix.substring(0,pos);
                if(set.contains(prefix)){
                    isSub = true;
                    break;
                }
            }
            if(!isSub){
                list.add(f);
            }
        }
        return list;
    }
}