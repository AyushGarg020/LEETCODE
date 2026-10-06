class Solution {
    public int minSwaps(String s) {
        int unmatched = 0;
        
        for(char ch : s.toCharArray()) {
            if(ch=='[')
                unmatched++;
            else if(unmatched>0)
                unmatched--;
        }
        return (unmatched+1)/2;
    }
}