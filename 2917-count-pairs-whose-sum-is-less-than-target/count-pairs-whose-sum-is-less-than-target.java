class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count=0;
        for(int i=0;i<n;i++){
            int a = nums.get(i);
            for(int j=i+1;j<n;j++){
                int b = nums.get(j);
                if(a+b < target)
                count++;
            }
        }
        return count;
    }
}

// TC: O(n.logn)
// SC: O(logn)



// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         Collections.sort(nums);
//         int i=0; 
//         int j=nums.size()-1;
//         int count = 0;
//         while(i<j) {
//             int sum = nums.get(i)+nums.get(j);
//             if(sum<target) {
//                 count+=(j-i);
//                 i++;
//             }
//             else {
//                 j--;
//             }
//         }
//         return count;
//     }
// }