class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[101];
        for(int bulb : bulbs)
            arr[bulb]++;

        for(int i=0; i<101; i++) 
            if(arr[i]%2!=0)
                ans.add(i);

        return ans;
    }
}