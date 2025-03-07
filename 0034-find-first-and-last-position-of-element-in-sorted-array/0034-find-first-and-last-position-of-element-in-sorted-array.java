class Solution {
    public int[] searchRange(int[] nums, int target){
        int result[] = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                found = true;
                result[0] = mid;
                right = mid - 1;
            }else if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if(!found){
            return result;
        }
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                result[1] = mid;
                left = mid + 1;
            }else if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return result;
    }
}