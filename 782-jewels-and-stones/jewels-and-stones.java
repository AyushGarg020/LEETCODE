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
/*
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }
}
*/