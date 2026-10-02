class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int maxSoFar = 0;
        for (int currentNum : nums) {
            if (currentNum >= maxSoFar) {
                count++;
                maxSoFar = currentNum;
            }
        }
        return count;
    }
}
