class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(nums==null || nums.length==0)
            return false;
        
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        set.add((long)nums[0]);
        
        for(int i=1; i<n; i++) {
            if(i>indexDiff) {
                set.remove((long)nums[i-indexDiff-1]);
            }
            long left = (long)nums[i]-valueDiff;
            long right = (long)nums[i]+valueDiff;
            
            if(left<=right && !set.subSet(left, right+1).isEmpty())
                return true;
            
            set.add((long)nums[i]);
        }
        return false;
    }
}