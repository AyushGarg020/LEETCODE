class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] arr = new int[101];
        for(int i=0; i<nums.length; i++) {
            if(i==0 || nums[i] != nums[i-1])
                arr[nums[i]]++;
        }

        int ans = 0;
        for(int num : arr)
            if(num==1)
                ans++;

        return ans;
    }
}