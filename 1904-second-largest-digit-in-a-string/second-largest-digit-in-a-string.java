class Solution {
    public int secondHighest(String s) {
        int highest = -1;
        int secondHighest = -1;
        
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                int num = ch - '0';
                if(num>highest) {
                    secondHighest = highest;
                    highest = num;
                }
                else if(num>secondHighest && num<highest) 
                    secondHighest = num;
            }
        }
        
        return secondHighest;
    }
}