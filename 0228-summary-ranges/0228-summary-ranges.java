class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int start = nums[i], move = nums[i];       
            while(i + 1 < nums.length && move + 1 == nums[i + 1]) {
                i++;
                move++;
            }
            
            if(start != nums[i]) list.add(String.valueOf(start) + "->" + String.valueOf(move));
            else list.add(String.valueOf(start));
            
        }

        return list;
    }
}