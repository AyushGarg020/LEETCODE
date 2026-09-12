class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        for(int i=0; i<2*n; i++) {
            int val = nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<val) {
                res[st.peek()] = val;
                st.pop();
            }
            if(i<n) {
                st.push(i);
            }
        }
        return res;
    }
}