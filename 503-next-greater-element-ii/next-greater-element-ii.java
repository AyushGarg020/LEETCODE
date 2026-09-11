class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<2*n; i++) {
            int val = nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()] < val) {
                arr[stack.peek()] = val;
                stack.pop();
            }
            if(i<n) {
                stack.push(i);
            }
        }
        return arr;
    }
}