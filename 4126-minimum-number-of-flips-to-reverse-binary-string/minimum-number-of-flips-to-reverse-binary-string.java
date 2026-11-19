class Solution {
    public int minimumFlips(int n) {
        String str = Integer.toBinaryString(n);
        int left = 0;
        int right = str.length()-1;
        int ans = 0;

        while(left<right) {
            if(str.charAt(left)!=str.charAt(right))
                ans+=2;
            left++;
            right--;
        }
        return ans;
    }
}