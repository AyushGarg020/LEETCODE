class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return seconds(endTime) - seconds(startTime);

    }

    public int seconds(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6));
        return (hours*3600)+(minutes*60)+seconds;
        
    }
}