class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k<1)
            return nums[0];
        int n = nums.length;
        double sum = 0;

        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }

        double max = sum/k;

        for(int i=k; i<n; i++) {
            sum = sum-nums[i-k]+nums[i];
            double ans = sum/k;
            if(max<ans)
                max = ans;
        }
        return max;
    }
}