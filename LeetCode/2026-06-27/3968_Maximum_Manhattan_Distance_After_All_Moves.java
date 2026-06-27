class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l = 0, r = 0, m = 0;

        for(char c : moves.toCharArray()){
            if(c == 'U') u++;
            else if(c == 'D') d++;
            else if(c == 'L') l++;
            else if(c == 'R') r++;
            else m++;
        }
        int hor = Math.abs(l - r);
        int ver = Math.abs(u - d);

        return hor + ver + m;
    }
}