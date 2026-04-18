class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];

                if(num == '.') continue;

                String r = num + "row" + i;
                String c = num + "col" + j;
                String box = num + "box" + (i/3) +  "-" + (j/3);

                if(set.contains(r) || set.contains(c) || set.contains(box)) return false;

                set.add(r);
                set.add(c);
                set.add(box);
            }
        }
        return true;
    }
}
// i saw the answer in which boolean arrays are used and that is fast i will do it one day.