class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null | s==t)
            return true;
        if(s==null || t==null)
            return false;
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            int indexS = map1.getOrDefault(s.charAt(i), -1);
            int indexT = map2.getOrDefault(t.charAt(i), -1);

            if(indexS!=indexT)
                return false;
            
            map1.put(s.charAt(i), i);
            map2.put(t.charAt(i), i);
        }
        return true;
    }
}

/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null | s==t)
            return true;
        if(s==null || t==null)
            return false;
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            if(map.containsKey(first) && map.get(first)!=second)
                return false;
            if(map.containsValue(second) && !map.containsKey(first))
                return false;
            map.put(first, second);
        }
        return true;        
    }
}
*/