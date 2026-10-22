class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        for(int i=g.length-1, j=s.length-1; i>=0 && j>=0;) {
            if(g[i]<=s[j]) {
                j--;
                i--;
                count++;
            }
            else {
                i--;
            }
        }
        return count;
    }
}