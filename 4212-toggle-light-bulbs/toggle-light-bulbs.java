class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] arr = new boolean[101];
        for(int bulb : bulbs)
            arr[bulb] = !arr[bulb];

        for(int i=0; i<101; i++) 
            if(arr[i])
                ans.add(i);

        return ans;
    }
}