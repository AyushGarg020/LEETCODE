class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int previous = map.getOrDefault(nums[i], -999999);

            if(i-previous <=k)
                return true;
            
            map.put(nums[i], i);
        }
        
        return false;
    }
}
/*
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var set = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++) {
            if(i>k)
                set.remove(nums[i-k-1]);
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
*/