class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];

        for(int num : nums) {
            sum+=num;
            if(num<min)
                min = num;
        }
        return sum-(nums.length*min);
    }
}
/*
class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int num : nums) {
            sum+=num;
            min = Math.min(min, num);
        }
        return sum-n*min;
    }
}
*/