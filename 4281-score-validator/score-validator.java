class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr = new int[2];
        
        for(String ch : events) {
            if(ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("6")) {
                int num = Integer.parseInt(ch);
                arr[0]+=num;
            }
            else if(ch.equals("W"))
                arr[1] += 1;
            else
                arr[0] += 1;
            
            if(arr[1]==10)
                break;
        }
        return arr;
    }
}