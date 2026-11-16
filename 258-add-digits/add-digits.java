class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }
}
/*class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>=10){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}*/
/*class Solution {
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
}*/