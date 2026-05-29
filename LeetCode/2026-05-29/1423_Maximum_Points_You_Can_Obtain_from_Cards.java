class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int rSum = 0;
        int lSum = 0;
        int r = cardPoints.length - 1;
        for(int i = 0; i < k; i++){
            lSum += cardPoints[i];
        }
        if(k == cardPoints.length) return lSum;
        max = lSum;
        for(int i = k-1; i >= 0; i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[r];
            r--;
            max = Math.max(max,lSum+rSum);
        }
        return max;
    }
}