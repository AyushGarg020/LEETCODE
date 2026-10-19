class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int targetCount = 0;
        int targetDiff = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<target)
                targetDiff++;
            else if(target==nums[i])
                targetCount++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<targetCount; i++) {
            list.add(targetDiff+i);
        }
        return list;
    }
}

/*
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++) 
            if(nums[i]==target)
                arr.add(i);

        return arr;
    }
}
*/