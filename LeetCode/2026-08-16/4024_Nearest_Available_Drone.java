class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < drones.length; i++){
            int range = 0;
            for(int j = 0; j < 3; j++){
                range = Math.abs(drones[i][0]-target[0])+ Math.abs(drones[i][1]-target[1]);
            }
            if(range <= drones[i][2]){
                if(min > range){
                    min = range;
                    ans = i;
                }
            }
        }
        return ans;
    }
}