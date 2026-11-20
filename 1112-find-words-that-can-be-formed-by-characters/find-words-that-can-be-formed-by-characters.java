class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] masterCount = new int[26];
        for(int i=0;i<chars.length();i++) {
            masterCount[chars.charAt(i) - 'a']++;
        }
        int sumLengths = 0;
        for(String word : words) {
            if(canForm(word, masterCount)) {
                sumLengths += word.length();
            }
        }
        return sumLengths;
    }

    public boolean canForm(String word, int[] masterCount) {
        int[] wordCount = new int[26];
        for(int i=0;i<word.length();i++) {
            int charIndex = word.charAt(i) - 'a';
            wordCount[charIndex]++;
            if(wordCount[charIndex] > masterCount[charIndex]) 
                return false;
        }
        return true;
    }
}
/*class Solution {
    public int countCharacters(String[] words, String chars) {
        var arr = new char[26];
        for(char ch : chars.toCharArray()) {
            arr[ch-'a']++;
        }
        char[] arr2 = Arrays.copyOf(arr, arr.length);

        int ans = 0;
        int count = 0;

        for(String word : words) {
            for(int j=0; j<word.length(); j++) {
                if(arr[word.charAt(j)-'a']>0) {
                    count++;
                    arr[word.charAt(j)-'a']--;
                }
                
                else 
                    count = 0;
                
            }
            if(count==word.length()) {
                ans+=word.length();
            }
            count = 0;
            arr = Arrays.copyOf(arr2, arr.length);
        }
        return ans;
    }
}*/