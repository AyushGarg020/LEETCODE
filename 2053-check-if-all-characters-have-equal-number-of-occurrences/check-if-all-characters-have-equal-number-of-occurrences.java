class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray())
            arr[ch-'a']++;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<26; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]!=0 && arr[i]<min)
                min = arr[i];
        }
        if(min==max && min!=Integer.MAX_VALUE)
            return true;
        return false;
    }
}