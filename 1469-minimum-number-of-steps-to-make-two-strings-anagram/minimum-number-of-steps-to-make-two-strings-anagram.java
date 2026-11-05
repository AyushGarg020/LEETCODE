class Solution {
    public static int minSteps(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            freq[s.charAt(i) - 'a']--;
            freq[t.charAt(i) - 'a']++;
        }
        int sum = 0;
        for(int i = 0 ; i<26 ; i++){
            if(freq[i]>0)
            sum += freq[i];
        }
        return sum;
    }
}
/*
class Solution {
    public int minSteps(String s, String t) {
        int[] s_arr = new int[26];
        int[] t_arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            s_arr[ch-'a']++;
            ch = t.charAt(i);
            t_arr[ch-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++) {
            if(s_arr[i]>t_arr[i])
                count+= s_arr[i]-t_arr[i];
        }
        return count;
    }
}
*/