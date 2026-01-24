class Solution {
    public int manhattan(int arr[], int cen[]){
        return Math.abs(arr[0] - cen[0]) + Math.abs(arr[1] - cen[1]);
    }
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int currx = -1;
        int curry = -1;
        int currq = -1;
        for(int i = 0; i < towers.length; i++){
            int man = manhattan(towers[i], center);
            if(man  > radius) continue;

            int x = towers[i][0];
            int y = towers[i][1];
            int q = towers[i][2];


            if(q > currq ||
            (q == currq && (currx == -1 || x < currx || (x == currx && y < curry)))){

                currq = q;
                currx = x;
                curry = y;
            }
        }
        if(currx == -1) return new int[]{-1, -1};
        return new int[]{currx, curry};
    }
}