class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long prif[] = new long[n];
        long suff[] = new long[n];
        prif[0] = nums[0];
        for(int i = 1; i < n; i++){
            prif[i] = prif[i-1] + nums[i];
        }
        suff[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + nums[i];
        }

        int ans = 0;
        for(int i = 0; i < n-1; i++){
            if(prif[i] >= suff[i+1]) ans++;
        }
        return ans;
    }
}