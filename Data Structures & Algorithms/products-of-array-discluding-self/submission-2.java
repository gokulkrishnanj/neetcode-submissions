class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] prefixProduct = new int[len]; // O(N)
        int [] suffixProduct = new int[len]; // O(N)
        int preProduct=1, suffProduct=1;
        for(int i=0;i<len;i++){
            preProduct = preProduct*nums[i];
            suffProduct = suffProduct*nums[len-i-1];
            prefixProduct[i] = preProduct;
            suffixProduct[len-i-1] = suffProduct;
        } //O(N)
        // System.out.println(Arrays.toString(prefixProduct));
        // System.out.println(Arrays.toString(suffixProduct));
        for(int i=0;i<len;i++){
            if(i==0)
                nums[i] = suffixProduct[i+1];
            else if(i==len-1)
                nums[i] = prefixProduct[i-1];
            else{
                nums[i] = suffixProduct[i+1] * prefixProduct[i-1];
            }
        } //O(N)

        // Time complexity: O(N) space complexity O(N)
        return nums;
    }
}  
