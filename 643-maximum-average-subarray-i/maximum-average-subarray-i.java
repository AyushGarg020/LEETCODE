class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }
        
        double ans = sum/k;
        double max = ans;

        for(int i=k; i<nums.length; i++) {
            sum = sum-nums[i-k];
            sum = sum+nums[i];
            ans = sum/k;
            if(max<ans)
                max = ans;
        }
        return max;
    }
}