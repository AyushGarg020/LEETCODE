class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(isSelfDividing(i))
                arr.add(i);
        }
        return arr;
    }
    public boolean isSelfDividing(int number) {
        int temp = number;
        while(temp>0) {
            int digit = temp%10;
            if(digit==0 || number%digit!=0)
                return false;
            temp/=10;
        }
        return true;
    }
}