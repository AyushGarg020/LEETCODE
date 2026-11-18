class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int n = s.length();
        int idx = 0;

        for(String word : words) {
            for(int j=0; j<word.length(); j++) {
                if(idx==n)
                    return false;
                if(s.charAt(idx)!=word.charAt(j))
                    return false;
                idx++;
            }
            if(idx==n)
                return true;
        }
        return false;
    }
}