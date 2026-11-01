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