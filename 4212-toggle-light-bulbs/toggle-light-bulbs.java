class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] bulbState = new boolean[101];
        for(Integer bulb : bulbs) {
            bulbState[bulb] = !bulbState[bulb];
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i=1; i<101; i++) {
            if(bulbState[i]) {
                result.add(i);
            }
        }

        return result;
    }
}