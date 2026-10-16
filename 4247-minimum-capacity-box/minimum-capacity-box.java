// class Solution {
//     public int minimumIndex(int[] capacity, int itemSize) {
//         int ans = -1;
//         int cap = Integer.MAX_VALUE;
//         for(int i=0; i<capacity.length; i++) {
//             if(capacity[i]>=itemSize && capacity[i]<cap) {
//                 cap = capacity[i];
//                 ans = i;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<min){
                min=capacity[i];
              index=i;
            }
          
        }
        return index;
    }
}