class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[2 * len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[i];
        }
        for (int i = len; i < len * 2; i++) {
            result[i] = nums[i - len];
        }
        return result;
    }
}