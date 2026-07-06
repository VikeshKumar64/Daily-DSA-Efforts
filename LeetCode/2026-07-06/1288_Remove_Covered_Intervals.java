class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> 
        a[0] == b[0]
            ? Integer.compare(b[1],a[1]) 
            :Integer.compare(a[0], b[0]));

        int ans = intervals.length;
        int lastIntEndPoint = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(lastIntEndPoint < intervals[i][1]){
                lastIntEndPoint = intervals[i][1];
            }else{
                ans--;
            }
        }
        return ans;
    }
}