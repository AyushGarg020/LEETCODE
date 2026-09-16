class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char c : s.toCharArray()) {
            res^=c;
        }
        for(char c : t.toCharArray()) {
            res^=c;
        }
        return res;
    }
}

/*
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        int i = 0;
        for(i=0; i<s.length(); i++) {
            char f = s.charAt(i);
            char ff = t.charAt(i);
            res^=f;
            res^=ff;            
        }
        res^=t.charAt(i);
        return res;
    }
}
*/