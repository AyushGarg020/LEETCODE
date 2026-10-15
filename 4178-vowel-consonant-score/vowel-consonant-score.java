class Solution {
    public int vowelConsonantScore(String s) {
        int vowel = 0;
        int consonant = 0;
        for(char ch : s.toCharArray()) {
            if(ch == ' ')
                continue;
            else if(Character.isDigit(ch))
                continue;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowel++;
            else
                consonant++;
        }
        if(consonant==0)
            return 0;
        return (int)Math.floor(vowel/consonant);
    }
}