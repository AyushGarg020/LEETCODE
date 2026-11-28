class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : nums) {
            if(ans.indexOf(num)==-1) {
                int freq = map.getOrDefault(num, 0);
                if(freq>n/3)
                    ans.add(num);
            }
        }
        return ans;
    }
}