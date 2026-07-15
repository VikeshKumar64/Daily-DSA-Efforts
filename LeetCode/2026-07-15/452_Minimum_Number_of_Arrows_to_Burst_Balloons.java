class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int prev[] = points[0];

        int count = 1;

        for(int i = 0; i < n; i++){
            int currStartPoint = points[i][0];
            int currEndPoints = points[i][1];

            int prevStartPoint = prev[0];
            int prevEndPoints = prev[1];

            if(currStartPoint > prevEndPoints){
                count++;
                prev = points[i];
            }else{
                prev[0] = Math.max(currStartPoint,prevStartPoint);
                prev[1] = Math.min(currEndPoints,prevEndPoints);
            }
        }
        return count;
    }
}