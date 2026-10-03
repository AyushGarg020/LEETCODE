class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int leftProd = 1;
        for(int i=0; i<nums.length; i++) {
            arr[i] = leftProd;
            leftProd*=nums[i];
        }

        int rightProd = 1;
        for(int i=n-1; i>=0; i--) {
            arr[i] *= rightProd;
            rightProd*=nums[i];
        }
        return arr;
    }
}