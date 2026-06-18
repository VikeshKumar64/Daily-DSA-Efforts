class Solution {
    public double angleClock(int hour, int minutes) {

        if(hour == 12) hour = 0;
        double ans = 0;
        ans = Math.abs((hour*30) - (11.0*minutes)/2);
        return Math.min(ans,360-ans);
    }
}