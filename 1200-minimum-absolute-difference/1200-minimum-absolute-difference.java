class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i+1]-arr[i];
            if(temp<min){
                ans.clear();
                ans.add(Arrays.asList(arr[i],arr[i+1]));
                min=temp;
            }else if(temp==min){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ans;
        
    }
}