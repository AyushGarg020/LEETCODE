class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        var set = new HashSet<String>();

        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                sb.append(morseCode[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}