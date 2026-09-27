class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1, k=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[k] = nums[j];
                i++;
                k++;
            }
        }
        return k;
    }
}