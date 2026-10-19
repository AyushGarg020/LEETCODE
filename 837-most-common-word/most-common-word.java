class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        var set = new HashSet<String>(Arrays.asList(banned));
        var map = new HashMap<String, Integer>();

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");

        for(String word : words) {
            if(!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}