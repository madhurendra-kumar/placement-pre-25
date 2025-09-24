class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:deck){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int gcd=-1;
        for(int count:map.values()){
            if(gcd==-1){
                gcd=count;
            }else{
                gcd=findGCD(gcd, count);
            }
        }
        return gcd>=2;
        
    }
    private int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b, a %b);
    }
}