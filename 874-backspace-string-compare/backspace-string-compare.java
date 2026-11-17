class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<Character>();
        int len1 = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '#') {
                if(len1>0) {
                    len1--;
                    st.pop();
                }
            }
            else {
                len1++;
                st.push(ch);
            }
        }

        Stack<Character> st2 = new Stack<Character>();
        int len2 = 0;
        
        for(char ch : t.toCharArray()) {
            if(ch == '#') {
                if(len2>0) {
                    len2--;
                    st2.pop();
                }
            }
            else {
                st2.push(ch);
                len2++;
            }
        }
        if(len1!=len2)
            return false;
        
        while(len1>0 && len2>0) {
            char ch = st.pop();
            char ch2 = st2.pop();
            if(ch!=ch2)
                return false;
            len1--;
            len2--;
        }
        return true;
    }
}