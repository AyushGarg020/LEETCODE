class Solution {
    public int countSegments(String s) {
        String[] str = s.split(" ");
        int count = 0;

        for(String c : str)
            if(!c.isEmpty())
                count++;

        return count;
    }
}