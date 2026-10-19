class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for(int i=0; i<events.length; i++) {
            if(events[i].length()==1) {
                if(events[i].charAt(0)=='W') {
                    counter++;
                    if(counter==10)
                        break;
                }
                else {
                    int num = (int)events[i].charAt(0)-'0';
                    score+=num;
                }

            }
            else
                score++;
        }
        int[] arr = {score, counter};
        return arr;
    }
}

/*
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
*/