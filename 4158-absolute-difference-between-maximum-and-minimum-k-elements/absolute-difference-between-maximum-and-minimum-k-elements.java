class Solution {
    public int absDifference(int[] nums, int k) {
        int largestSum = 0;
        int smallestSum = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(k>0) {
            largestSum+=nums[left++];
            smallestSum+=nums[right--];
            k--;
        }
        return Math.abs(largestSum-smallestSum);
    }
}
/*
class Solution {
    public int absDifference(int[] nums, int k) {
        int largestSum = 0;
        int smallestSum = 0;
        Arrays.sort(nums);
        
        for(int i=0, j=nums.length-1; i<k; i++, j--) {
            largestSum+=nums[i];
            smallestSum+=nums[j];
        }
        return Math.abs(largestSum-smallestSum);
    }
}
*/