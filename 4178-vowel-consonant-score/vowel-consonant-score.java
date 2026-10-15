class Solution {
    public int vowelConsonantScore(String s) {
        int vowel = 0;
        int consonant = 0;
        for(char ch : s.toCharArray()) {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowel++;
            else if(ch>='a' && ch<='z')
                consonant++;
        }
        if(consonant==0)
            return 0;
        int ans = vowel/consonant;
        return ans;
    }
}