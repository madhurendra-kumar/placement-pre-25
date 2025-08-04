class Solution {
    public int distributeCandies(int[] candyType) {
        int max=candyType.length/2;
        boolean[] typeCheck=new boolean[200002];
        int res=0;
        for(int i: candyType){
            i+=100000;
            if(!typeCheck[i]){
                res++;
                if(res==max){
                    return max;
                }
                typeCheck[i]=true;
            }
        }
        return res;
        
    }
}