class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int current = nums.length;
        for(int i=0; i<current; i++) {
            if(nums[i]!=0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
    }
}