class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            int rev = 26-(s.charAt(i)-'a');
            int str = i+1;
            ans+=rev*str;
        }
        return ans;
    }
}