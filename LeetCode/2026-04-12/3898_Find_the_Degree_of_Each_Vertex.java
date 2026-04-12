class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int colSum = 0;
            for(int j = 0; j < n; j++){
                colSum += matrix[i][j];
            }
            ans[i] = colSum;
        }
        return ans;
    }
}