class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[128];

        for(char ch : jewels.toCharArray())
            arr[ch] = 1;

        int count = 0;

        for(char ch : stones.toCharArray())
            count += arr[ch];

        return count;
    }
}