class Solution {
    public boolean isValid(String s) {
        if(s=="") return true;
        if(s.length() % 2 != 0) return false;
        if(s.charAt(0)=='}' || s.charAt(0)==']' || s.charAt(0)==')') 
            return false;

        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch=='{' || ch=='[' || ch=='(') {
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()) return false;
            char check = stack.peek();
            switch(ch) {
                case ')':
                    if(check=='{' || check=='[') return false;
                    stack.pop();
                    break;
                case '}':
                    if(check=='(' || check=='[') return false;
                    stack.pop();
                    break;
                case ']':
                    if(check=='{' || check=='(') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}