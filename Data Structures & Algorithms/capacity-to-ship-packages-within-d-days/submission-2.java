class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:weights){
            max = Math.max(max, i);
            sum+=i;
        }
        int start = max, end = sum;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(isPossible(mid, days, weights))
                end = mid-1;
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public static boolean isPossible(int capacity, int days, int[]a){
        int index=0;
        while(days>=1 && index<=a.length-1){
            int dayCapacity = capacity;
            for(int i=index;i<a.length;i++){
                if(a[i]<= dayCapacity){
                    dayCapacity-=a[i];
                    index = i + 1;
                }
                else{
                    break;
                }
            }
            days--;
        }
        return index==a.length;
    }

}