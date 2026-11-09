class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length();
        if(s.charAt(0) != s.charAt(n - 1))
            return false;
        for(int i = 0; i < n; i++){
            int index = s.indexOf(' ', i);
            if(index < 0) break;
            if(s.charAt(index - 1) != s.charAt(index + 1))
                return false;
            i = index;
        }
        return true;
    }
}
/*
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");
        int n = str.length;

        for(int i=0; i<n; i++) {
            String current = str[i];
            String next = str[(i+1)%n];

            char last = current.charAt(current.length()-1);
            char first = next.charAt(0);
            if(last!=first)
                return false;
        }
        return true;
    }
}
*/