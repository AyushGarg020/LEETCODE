class Solution {
    public int getSum(int a, int b) {
        if(b==0)
            return a;

        int sumWithoutCarry = a^b;

        int carry = (a&b)<<1;
        
        return getSum(sumWithoutCarry, carry);
    }
}
/*
class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        while (b != 0) {
            int sumWithoutCarry = a^b;
            carry = (a&b) << 1 ;
            b = carry;
            a = sumWithoutCarry;           
        }
        return a;
        
        // Sum of two bit(a,b):
        // carry = a&b
        // sum without carry = a^b
        // Sum with carry = a^b^carry
    }
}
*/