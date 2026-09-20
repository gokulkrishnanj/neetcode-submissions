class Solution {
    public int findMin(int[] nums) {
        int minimumEle = Integer.MAX_VALUE;
        for(int i:nums){
            minimumEle = Math.min(minimumEle, i);
        }
        return minimumEle;
    }
}
