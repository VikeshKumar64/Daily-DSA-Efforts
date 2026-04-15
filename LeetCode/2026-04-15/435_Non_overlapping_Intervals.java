class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int ans = 0;
        int[] curr = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < curr[1]){
                ans++;
            }else{
                curr = intervals[i];
            }
        }
        return ans;
    }
}