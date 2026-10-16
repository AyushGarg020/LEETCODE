class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int first = -1;
        int second = -1;
        int ans = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1)
                first = i;
            else if(nums[i]==2)
                second = i;
            
            if(first>-1 && second>-1) {
                
                int min = Math.abs(first-second);
                if(ans>min || ans==-1)
                    ans = min;
            }
        }
        return ans;
    }
}