class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for(int num : nums1)
            seen[num] = true;
        
        int[] arr = new int[1001];
        int count = 0;

        for(int num : nums2) 
            if(seen[num]) {
                arr[count++] = num;
                seen[num] = false;
            }
        
        int[] ans = new int[count];

        for(int i=0; i<count; i++)
            ans[i] = arr[i];
        
        return ans;
    }
}