class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans = -1;
        var map = new HashMap<Integer, Integer>();

        for(int num : nums)
            if(num%2==0)
                map.put(num, map.getOrDefault(num, 0)+1);

        int min = Integer.MAX_VALUE;;
        int freq = -1;

        for(int num : nums) {
            if(num%2==0) {
                int f = map.getOrDefault(num, 0);
                if(f>freq) {
                    freq = f;
                    ans = num;
                }
                else if(freq==f && ans>num)
                    ans = num;
            }
        }
        
        return ans;
    }
}