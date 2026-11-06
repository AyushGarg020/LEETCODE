class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        for(int num : nums)
            count[num]++;
        for(int i=1; i<count.length; i++)
            count[i]+=count[i-1];
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0)
                result[i] = 0;
            else
                result[i] = count[nums[i]-1];
        }
        return result;
    }
}    
/*
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j)
                    continue;
                if(nums[i]>nums[j])
                    result[i]++;
            }
        }
        return result;
    }
}
*/