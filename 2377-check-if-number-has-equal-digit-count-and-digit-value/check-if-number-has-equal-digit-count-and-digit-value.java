class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        int len = num.length();

        for(char ch : num.toCharArray()) {
            int digit = ch-'0';
            freq[digit]++;
        }

        for(int i=0; i<len; i++) {
            int expected = num.charAt(i)-'0';
            int actual = freq[i];
            if(expected!=actual)
                return false;
        }
        return true;
    }
}