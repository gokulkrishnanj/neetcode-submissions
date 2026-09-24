class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(isPossible(matrix[i], target))
                return true;
        }
        return false;
    }

    public static boolean isPossible(int []a, int target){
        int len = a.length;
        int start = 0, end =len-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(a[mid]==target)
                return true;
            else if(a[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1; 
            }
        }
        return false;
    }

}
