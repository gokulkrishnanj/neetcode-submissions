class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        int start = 0, end = len-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<= nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(nums[mid]<=nums[end]){
                if(nums[mid]<=target && target<=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}