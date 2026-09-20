class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int start =0, end = len-1;
        while(start<end){
            int mid = start + (end- start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }
}