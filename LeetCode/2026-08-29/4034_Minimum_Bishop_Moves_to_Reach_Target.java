class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sR = source[0];
        int sC = source[1];
        int tR = target[0];
        int tC = target[1];

        if((sR + sC) % 2 != (tR + tC)%2) return -1;

        if (Math.abs(sR - tR) == Math.abs(sC - tC)) return 1;

        return 2;
    }
}