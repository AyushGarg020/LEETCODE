class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if(k==0)
            return ans;

        for(int i=0; i<n; i++) {
            if(k>0) {
                for(int j=1; j<=k; j++) {
                    int circular = (i+j)%n;
                    ans[i] += code[circular];
                }
            }
            else {
                for(int j=k; j<0; j++) {
                    int circular = (i+j+n)%n;
                    ans[i] += code[circular];
                }
            }
        }

        return ans;
    }
}