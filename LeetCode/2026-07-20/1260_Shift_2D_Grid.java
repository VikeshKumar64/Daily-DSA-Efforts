class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;

        k %= size;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int newIndex = i * n + j;
                int oldIndex = (newIndex - k + size) % size;

                row.add(grid[oldIndex / n][oldIndex % n]);
            }
            ans.add(row);
        }

        return ans;
    }
}