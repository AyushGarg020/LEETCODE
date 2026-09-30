class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count = 0;
        int n = seq.length();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            if(seq.charAt(i) == '(') {
                arr[i] = count & 1;
                count++;
            }
            else {
                count--;
                arr[i] = count & 1;
            }
        }
        return arr;
    }
}