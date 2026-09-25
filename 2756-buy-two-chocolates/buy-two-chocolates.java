class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : prices) {
            if(num<min){
                min2 = min;
                min = num;
            }
            else if(num>=min && num<min2)
                min2 = num;
        }
        
        int ans = money - (min+min2);

        return (ans>=0) ? ans : money;
    }
}