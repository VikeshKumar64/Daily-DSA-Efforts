class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int prifix[] = new int[n];
        int suffix[] = new int[n];

        prifix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prifix[i] = prifix[i - 1] + nums[i];
        }
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }
        int ans = 0;

        for(int i = 0;  i < n; i++){
            int l = (i == 0) ? 0 : prifix[i - 1];
            int r = (i == n - 1) ? 0 : suffix[i + 1];
            if(l == r) return i;
        }
        return -1;
    }
}