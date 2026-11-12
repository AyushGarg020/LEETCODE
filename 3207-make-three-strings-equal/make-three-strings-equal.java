class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int o = s3.length();
        
        int min = Math.min(m, Math.min(n, o));
        int len = m+n+o;

        for(int i=0; i<min; i++) {
            if(!(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i))) {
                if(i==0)
                    return -1;
                return len-3*i;
            }
        }
        return len-3*min;
    }
}