class Solution {
    public int countNeigh(int board[][], int r, int c, int m, int n){
        int count = 0;
        for(int dr = -1; dr <= 1; dr++){
            for(int dc = -1; dc <= 1; dc++){
                if(dr == 0 && dc == 0)continue;
                int nr = r + dr, nc = c + dc;
                if(nr >= 0 && nr < m && nc >=0 && nc < n && Math.abs(board[nr][nc]) == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                int neb = countNeigh(board, r, c, m, n);
                if(board[r][c] == 1 && (neb < 2 || neb > 3)){
                    board[r][c] = -1;
                }else if(board[r][c] == 0 && neb == 3){
                    board[r][c] = 2;
                }
            }
        }
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                board[r][c] = board[r][c] > 0 ? 1 : 0;
            }
        }   
    }
}