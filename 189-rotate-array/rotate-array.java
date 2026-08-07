class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k%=len;
        rotate_array(nums, 0, len-1);
        rotate_array(nums, 0, k-1);
        rotate_array(nums, k, len-1);
    }
    public void rotate_array(int[] nums, int start, int end) {
        int temp;
        while(start<=end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}