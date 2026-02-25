class Solution {
    public int getLeastFrequentDigit(int n) {
        int frq[] = new int[10];
        while(n > 0){
            frq[n%10]++;
            n /= 10;
        }
        int minFrq = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i < 10; i++){
            if(frq[i] > 0){
                if(frq[i] < minFrq){
                    minFrq = frq[i];
                    ans = i;
                }
            }
        }
        return ans;
    }
}