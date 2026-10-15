class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left<right) {
            if(arr[left]<'a' || arr[left]>'z')
                left++;
            else if(arr[right]<'a' || arr[right]>'z')
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        left = 0;
        right = arr.length-1;
        
        while(left<right) {
            if(arr[left]>='a' && arr[left]<='z')
                left++;
            else if(arr[right]>='a' && arr[right]<='z')
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
        // return new String(arr);
    }
}