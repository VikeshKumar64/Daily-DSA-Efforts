class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
            int j = 0;
            while(j < n && intervals[j][1] < newInterval[0]){
                ans.add(intervals[j]);
                j++;
            }

            while(j < n && intervals[j][0] <= newInterval[1]){
                newInterval[0] = Math.min(newInterval[0], intervals[j][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[j][1]);
                j++;
            }
            ans.add(newInterval);
            while(j < n){
                ans.add(intervals[j]);
                j++;
            }
        return ans.toArray(new int[ans.size()][]);
    }
}