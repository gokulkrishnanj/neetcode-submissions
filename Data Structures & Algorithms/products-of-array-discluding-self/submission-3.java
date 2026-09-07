class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[]suffixProduct = new int[len];
        int suffProduct=1;
        for(int i=0;i<len;i++){
            suffProduct *= nums[len-i-1];
            suffixProduct[len-1-i] = suffProduct;
        }
        int product=1;
        for(int i=0;i<len;i++){
            int currentNum = nums[i];
            if(i==0)
                nums[i] = suffixProduct[i+1];
            else if(i==len-1)
                nums[i] = product;
            else{
                nums[i] = product * suffixProduct[i+1];
            }
            product*=currentNum;
        }
        return nums;
    }
}  
