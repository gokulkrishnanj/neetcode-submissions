class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int columnLen = matrix[0].length;
        int start=0, end = len-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(matrix[mid][0]<= target && target<=matrix[mid][columnLen-1])
                return isPossible(matrix[mid], target);
            else if(target<matrix[mid][0]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
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
