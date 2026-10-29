class Solution {
    public String getHint(String secret, String guess) {
        int[] bull = new int[10];
        int[] cow = new int[10];
        int bulls = 0;
        int cows = 0;
        
        for(int i=0; i<secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s==g)
                bulls++;
            else {
                bull[s-'0']++;
                cow[g-'0']++;
            }
        }
        for(int i=0; i<10; i++)
            cows+=Math.min(bull[i], cow[i]);
            
        String ans = bulls+"A"+cows+"B";
        return ans;
    }
}