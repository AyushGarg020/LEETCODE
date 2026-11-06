class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        int n = words.length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(words[i]!=words[j] && words[j].contains(words[i])) {
                    arr.add(words[i]);
                    break;
                }
            }
        }
        return arr;
    }
}