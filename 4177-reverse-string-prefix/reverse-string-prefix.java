class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        k--;
        char[] arr = s.toCharArray();

        while(i<k) {
            char temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            k--;
            i++;
        }

        return String.valueOf(arr);
        //    OR
        //return new String(arr);
    }
}