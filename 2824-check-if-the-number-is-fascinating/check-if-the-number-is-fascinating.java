class Solution {
    public boolean isFascinating(int n) {
        String str = "" + n + (2*n) + (3*n);

        int[] arr = new int[10];

        for(char ch : str.toCharArray())
            if(++arr[ch-'0']>1)
                return false;
        
        return arr[0]==0 && str.length()==9;
    }
}