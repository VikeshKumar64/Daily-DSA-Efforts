class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = 0;

        for(int interval[] : intervals){
            int start = interval[0];
            int end = interval[1];

            while(!pq.isEmpty() && pq.peek() < start){
                pq.poll();
            }
            ans += pq.size();
            pq.offer(end);
        }
        return ans;
    }
}