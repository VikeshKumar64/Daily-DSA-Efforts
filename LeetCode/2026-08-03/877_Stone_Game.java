class Solution {
    public int solve(int piles[], int i, int j){
        int t[][] = new int[501][501];
        if(i > j) return 0;

        if(t[i][j] != -1) return t[i][j];
        int takeI = piles[i] + Math.min(solve(piles, i+2, j), solve(piles, i+1, j-1));

        int takeJ = piles[j] + Math.min(solve(piles, i, j-2), solve(piles, i+1, j-1));

        return t[i][j] = Math.max(takeI, takeJ);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int sum = 0;
        for(int nu : piles){
            sum += nu;
        }

        int A_score = solve(piles, 0, n-1);
        return A_score < sum / 2;
    }
}