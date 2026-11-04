class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 0;

        for(int i=2; i<=n; i++)
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);

        return dp[n];
    }
}
/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev1 = cost[0];
        int prev2 = cost[1];
        for (int i = 2; i < n; i++) {
            int curr = Math.min(prev1, prev2) + cost[i];
            prev1 = prev2;
            prev2 = curr;
        }
        return Math.min(prev1, prev2);
    }
}
*/