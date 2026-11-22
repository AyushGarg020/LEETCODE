class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        String[] str = s.split(" ");
        for(String word : str) {
            if(Character.isDigit(word.charAt(0))) {
                int num = Integer.parseInt(word);
                if(num > prev)
                    prev = num;
                else
                    return false;
            }
        }
        return true;
    }
}