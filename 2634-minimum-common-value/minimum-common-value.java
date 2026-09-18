class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;
        if(nums2[0]>nums1[nums1.length-1]) {
            return -1;
        }
        while(first!=nums1.length || second!=nums2.length) {
            if(nums1[first]>nums2[second]) {
                if(second >= nums2.length-1) {
                    return -1;
                }
                second++;
            }
            else if(nums1[first]<nums2[second]) {
                if(first >= nums1.length-1) {
                    return -1;
                }
                first++;
            }
            else {
                return nums1[first];
            }
        }
        return -1;
    }
}