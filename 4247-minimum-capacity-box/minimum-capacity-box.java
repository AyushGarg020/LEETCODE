class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = -1;
        int cap = Integer.MAX_VALUE;
        for(int i=0; i<capacity.length; i++) {
            if(itemSize<=capacity[i] && capacity[i]<cap) {
                cap = capacity[i];
                ans = i;
            }
        }
        return ans;
    }
}