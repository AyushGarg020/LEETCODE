class Solution {
    public int maximum69Number (int num) {
        int mask = 1;
        int max = num;
        while (num / mask > 0) {
            int digit = num / mask % 10;
            if (digit == 6) max = Math.max(max, num + mask * 3);
            mask *= 10;
        }
        return max;
    }
}
/*
class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);

        str = str.replaceFirst("6", "9");
        
        return Integer.parseInt(str);
    }
}
*/