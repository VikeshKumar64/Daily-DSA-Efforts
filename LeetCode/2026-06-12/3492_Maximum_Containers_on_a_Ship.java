class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int num = n * n;
        int ans = maxWeight / w;
        if(ans > num){
            return num;
        }else return ans;

    }
}