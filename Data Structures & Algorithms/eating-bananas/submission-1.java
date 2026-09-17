class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long toatalBananas = 0;
        for(int i:piles){
            toatalBananas+= i;
        }
        long start=1, end = toatalBananas;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(isPossible(mid, h , piles)){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return (int)start;
    }

    public static boolean isPossible(long bananasPerHour, int h, int[]a){
        long total=0;
        for(int i:a){
            total+= i/bananasPerHour;
            if(i%bananasPerHour !=0)
                total++;
        }
        return total<=h;
    }

}
