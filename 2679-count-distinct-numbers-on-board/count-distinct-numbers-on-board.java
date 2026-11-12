class Solution {
    public int distinctIntegers(int n) {
        if(n==1) return 1;
        return n-1;
    }
}
/*
class Solution {
    public int distinctIntegers(int n) {
        if(n==1)return 1;
        int c=0;
        for(int i=n;i>=0;i--){
            for(int j=1;j<=n;j++){
                if(i%j==1){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
*/