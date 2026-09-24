class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : candyType) 
            set.add(num);

        int n = candyType.length;
        return Math.min(n/2, set.size());
    }
}