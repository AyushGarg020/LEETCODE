class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[n];
        Arrays.fill(res, -1);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++) {
            while(!stack.isEmpty() && stack.peek()<nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
            }
        return res;
    }
}