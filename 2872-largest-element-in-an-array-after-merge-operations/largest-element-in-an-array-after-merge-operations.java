class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long sum = nums[n-1];
        for(int i=n-2; i>=0; i--) {
            if(nums[i]<=sum)
                sum+=nums[i];
            else
                sum = nums[i];
        }
        return sum;
    }
}
/*
class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        long sum = nums[n-1];
        long ans = 0;
        
        for(int i=n-2; i>=0; i--) {
            if(nums[i]<=sum)
                sum+=nums[i];
            else
                sum = nums[i];
            if(ans<sum)
                ans = sum;
        }   
        return ans;
    }
}
*/