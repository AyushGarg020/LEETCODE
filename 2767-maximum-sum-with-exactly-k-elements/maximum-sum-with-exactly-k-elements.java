class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int num : nums)
            if(num>max)
                max = num;
        
        while(k!=0) {
            sum+=max;
            max++;
            k--;
        }
        return sum;
    }
}