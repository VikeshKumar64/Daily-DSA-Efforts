class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for (int i = 0; i < n; i++) {
            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                temp[j] = grid[i][(j + rowShift[i]) % n];
            }

            grid[i] = temp;
        }

        for (int j = 0; j < n; j++) {
            int[] temp = new int[n];

            for (int i = 0; i < n; i++) {
                temp[i] = grid[(i + colShift[j]) % n][j];
            }

            for (int i = 0; i < n; i++) {
                grid[i][j] = temp[i];
            }
        }

        return grid;
    }
}