class Solution {
    public int findMin(int[] nums) {
        int minimum  = Integer.MAX_VALUE;
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (nums[start] <= nums[mid]){
                minimum  = Math.min(minimum, nums[start]);
                start = mid+1;
            }
            else if(nums[mid]<=nums[end]){
                minimum = Math.min(minimum, nums[mid]);
                end = mid-1;
            }
        }
        return minimum;
    }
}
