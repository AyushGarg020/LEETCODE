class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        for(char ch : s.toCharArray()) {
            if(ch=='(') 
                ++close;

            else if(close>0) 
                --close;
                
            else 
                ++open;
        }
        return open + close;
    }
}
// class Solution {
//     public int minAddToMakeValid(String s) {
//         for(char ch : s.toCharArray()) {
//             if(ch == '(') {
//                 stack.push(ch);
//             }                    
//             if(ch == ')') {
//                 if(stack.size()>0 && stack.peek()=='(') 
//                     stack.pop();
//                 else 
//                     stack.push(ch);
//             }
//         }
//         return stack.size();
//     }
// }