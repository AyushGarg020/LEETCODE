class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) {
            return false;
        }
        boolean vowel = false;
        boolean consonant = false;

        for(char letter : word.toCharArray()) {
            char low = Character.toLowerCase(letter);
            if(Character.isDigit(low)) continue;
            if(low=='a' || low=='e' || low=='i' || low=='o' || low=='u') vowel = true;
            else if(low>='a' && low<='z') consonant = true;
            else return false;
        }
        return (vowel && consonant);
    }
}