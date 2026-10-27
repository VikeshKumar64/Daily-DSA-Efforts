class Solution {
    int m, n;
    public boolean dfs(int i, int j, int[][] grid){
        if(i >= m || i < 0 || j >= n || j < 0) return false;

        if(grid[i][j] == 1) return true;
        grid[i][j] = 1;

        boolean b_left = dfs(i, j-1, grid);
        boolean b_top = dfs(i-1, j, grid);
        boolean b_right = dfs(i, j+1, grid);
        boolean b_down = dfs(i+1, j, grid);

        if(b_left && b_top && b_right && b_down) return true;

        return false;
    }
    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    if(dfs(i, j, grid)) ans++;
                }
            }
        }
        return ans;
    }
}