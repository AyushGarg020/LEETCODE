class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss = k;
        for(int i : arr){
            if(i <= miss)
                miss++;
            else
                break;
        }
        return miss;        
    }
}

/*
class Solution {
    public int findKthPositive(int[] arr, int k) {
        var set = new HashSet<Integer>();
        for(int num : arr)
            set.add(num);
        
        int i=0;
        int count=0;
        while(count<k) {
            i++;
            if(!set.contains(i))
                count++;
        }
        return i;
    }
}
*/