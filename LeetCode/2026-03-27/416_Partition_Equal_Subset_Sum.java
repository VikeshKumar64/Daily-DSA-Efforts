class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        if(sum % 2 != 0) return false;
        int store = sum / 2;
        boolean dp[] = new boolean[store + 1];

        dp[0] = true;
        for(int num : nums){
            for(int i = store; i >= num; i--){
                dp[i] = dp[i] || dp[i-num];
            }
        }
        return dp[store];
    }
}