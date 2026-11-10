class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        int[] arr = new int[len];
        int p1 = 0;
        int p2 = 0;
        int r = 0;

        while(p1<m && p2<n) {
            if(nums1[p1]<=nums2[p2]) {
                arr[r] = nums1[p1];
                p1++;
            }
            else {
                arr[r] = nums2[p2];
                p2++;
            }
            r++;
        }
        while(p1<m) {
            arr[r] = nums1[p1];
            p1++;
            r++;
        }
        while(p2<n) {
            arr[r] = nums2[p2];
            p2++;
            r++;
        }
        if(len%2==0) {
            return (arr[len/2]+arr[len/2-1])/2.0;
        }
        return arr[len/2];

    }
}