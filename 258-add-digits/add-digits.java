class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        String s = Integer.toString(num);
        while(s.length()>1) {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int i=0; i<s.length(); i++) {
                sum+=s.charAt(i)-'0';
            }
            sb.append(sum);
            s = sb.toString();
        }
        return Integer.parseInt(s);
    }
}