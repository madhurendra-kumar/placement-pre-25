class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>s=new Stack<>();
        int []a=new int[temperatures.length];
        for(int i=0;i<temperatures.length; i++){
            int temperature=temperatures[i];
            while(!s.isEmpty() && temperatures[s.peek()] <temperature){
                int idx=s.pop();
                a[idx]=i-idx;
            }
            s.push(i);
        }
        return a;
        
    }
}