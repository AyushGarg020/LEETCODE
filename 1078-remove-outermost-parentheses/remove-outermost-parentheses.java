class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch =='('){
                if(count > 0)
                    ans.append(ch);
                count++;
            }
            else{
                count--;
                if(count > 0)
                    ans.append(ch);
            }
        }
        return ans.toString();
    }
}

/*
class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int open = 0;
        int l = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(')
                open++;
            else
                open--;
            if(open==0) {
                str+=s.substring(l+1, i);
                l = i+1;
            }
        }
        return str;
    }
}
*/