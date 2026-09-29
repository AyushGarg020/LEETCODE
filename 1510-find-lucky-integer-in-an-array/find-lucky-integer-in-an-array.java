class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        for(int num : arr)
            nums[num]++;

        int ans = -1;
        
        for(int i=1; i<nums.length; i++)
            if(nums[i]==i)
                ans = i;

        return ans;
    }
}