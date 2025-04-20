class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int result=0;
        int groupCount=1;
        for(int index=1;index<answers.length;index++){
            if(answers[index]==answers[index-1]){
                if(groupCount>=answers[index]+1){
                    result=result+answers[index]+1;
                    groupCount=1;
                }else{
                    groupCount++;
                }
            }else{
                result=result+answers[index-1]+1;
                groupCount=1;
            }
        }
        result=result+answers[answers.length-1]+1;
        return result;
        
    }
}