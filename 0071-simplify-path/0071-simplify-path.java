class Solution {
    public String simplifyPath(String path) {
        List<String> list=new ArrayList<>();
        String str[]=path.split("/");
        for(String s:str){
            if(s.equals("")||s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!list.isEmpty()){
                    list.remove(list.size()-1);
                }
            }
            else{
                list.add(s);
            }
        }
        return "/"+String.join("/",list);

    }
}