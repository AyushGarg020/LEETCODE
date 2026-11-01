class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for(char ch : text.toCharArray())
            if(ch==' ')
                totalSpaces++;

        String[] words = text.trim().split("\\s+");

        if(words.length==1)
            return words[0]+" ".repeat(totalSpaces);
        
        int spaces = totalSpaces/(words.length-1);
        int remaining = totalSpaces%(words.length-1);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.length; i++) {
            sb.append(words[i]);
            if(i<words.length-1)
                sb.append(" ".repeat(spaces));
        }

        sb.append(" ".repeat(remaining));

        return sb.toString();
    }
}