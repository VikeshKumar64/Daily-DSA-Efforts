class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,1000000000);
        dp[0] = 0;

        for(int i = 1; i <= amount; i++){
            for(int coin: coins){
                if(i - coin >= 0){
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        } 
        return dp[amount] == 1000000000 ? -1 : dp[amount];
    }
}