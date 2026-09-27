class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n];
        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }
        System.out.println("arr1:" +Arrays.toString(arr));
        for(int i=0;i<n;i++){
            arr[m+i] = nums2[i];
        }
        System.out.println("arr2: "+Arrays.toString(arr));
        Arrays.sort(arr);
        for(int i=0;i<(m+n);i++){
            nums1[i] = arr[i];
        }
    }
}