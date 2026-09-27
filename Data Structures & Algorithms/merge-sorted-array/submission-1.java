class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n]; // O(M+N)
        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        } // O(M)
        for(int i=0;i<n;i++){
            arr[m+i] = nums2[i];
        } //O(N)
        Arrays.sort(arr); // O(nlogN)
        for(int i=0;i<(m+n);i++){
            nums1[i] = arr[i];
        }
        // TC: O(M+N+nlogn) SC: O(M+N)
    }
}