import java.util.Arrays;

class Solution {
    public int[] validSequence(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        // last[j] stores the latest index in word1 that can match the suffix word2[j...n2-1]
        int[] last = new int[n2];
        Arrays.fill(last, -1);
        
        // Pass 1: Greedy matching from right to left to find valid suffixes
        int i = n1 - 1;
        int j = n2 - 1;
        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
            i--;
        }
        
        int[] ans = new int[n2];
        boolean canSkip = true; // Tracks if we can still modify at most one character
        j = 0;
        
        // Pass 2: Greedy matching from left to right to build the lexicographically smallest sequence
        for (i = 0; i < n1; i++) {
            if (j == n2) {
                break;
            }
            
            // Case 1: Exact match - always prefer this to keep indices small
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
            } 
            // Case 2: Mismatch, but we have a modification left
            else if (canSkip) {
                // If it's the last character, we can safely replace it.
                // Otherwise, check if the remaining word1 suffix can cover the rest of word2.
                if (j == n2 - 1 || i < last[j + 1]) {
                    canSkip = false; // Consume our single modification
                    ans[j] = i;
                    j++;
                }
            }
        }
        
        // If we successfully matched all characters of word2, return the sequence
        return j == n2 ? ans : new int[0];
    }
}