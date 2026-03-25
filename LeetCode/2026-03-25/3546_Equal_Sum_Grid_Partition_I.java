class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                sum += grid[i][j];
            }
        }
        long colSum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                colSum += grid[i][j];
                if(sum - colSum == colSum) return true; 
            }
        }
        long rowSum = 0;
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length; j++){
                rowSum += grid[j][i];
                if(sum - rowSum == rowSum) return true; 
            }
        }
        return false;
    }
}