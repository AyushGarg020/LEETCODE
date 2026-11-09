class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int min = 1<<30;

        for(int i=0; i<nums.length; i++) {
            int current = nums[i];
            if(current>min)
                max = Math.max(max, current-min);
            else
                min = current;
        }
        return max;
    }
}
/*
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int right = 1;
        int left = 0;
        int ans = -1;
        while(right<n) {
            int num = nums[right]-nums[left];
            if(num>0) ans = Math.max(ans, num);

            if(nums[left]>nums[right])
                left = right;

            right++;
        }
        return ans;
    }
}
*/