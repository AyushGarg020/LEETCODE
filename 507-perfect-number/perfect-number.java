class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int original = num;
        int i = 1;
        while(num>i) {
            if(num%i==0) sum+=i;
            i++;
        }
        if(sum==original) return true;
        return false;
    }
}