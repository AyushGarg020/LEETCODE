class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        boolean foundB = false;
        
        for(char ch : s.toCharArray()) {
            if(ch=='b')
                foundB = true;
            if(ch=='a' && foundB)
                return false;
        }
        return true;
    }
}
/*class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        
        while(left<right) {
            if(s.charAt(left)!='a' && s.charAt(right)!='b')
                return false;

            if(s.charAt(left)=='a')
                left++;
            
            if(s.charAt(right)=='b')
                right--;
        }
        return true;
    }
}*/