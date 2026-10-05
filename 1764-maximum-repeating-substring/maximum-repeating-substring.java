class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        int max = sequence.length()/word.length();
        String str = word;
        for(int i=0; i<max; i++) {
            if(sequence.contains(str)) {
                ans++;
                str+=word;
            }
            else 
                break;
        }
        return ans;
    }
}