class Solution {
    public boolean checkGoodInteger(int n) {
     int sum=0;
     while(n>0)
     {
        int digit=n%10;
        sum+=digit*digit-digit;
        n/=10;
     }   
     return sum>=50;
    }
}
/*
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        while(n!=0) {
            int num = n%10;
            n/=10;
            digitSum += num;
            squareSum+= (num*num)-num;
        }
        if(squareSum-digitSum>=50)
            return true;
        return false;
    }
}
*/