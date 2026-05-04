class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] closest = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) closest[i] = 1;
            else if (i == n - 1) closest[i] = n - 2;
            else {
                int left = nums[i] - nums[i - 1];
                int right = nums[i + 1] - nums[i];
                closest[i] = (left <= right) ? i - 1 : i + 1;
            }
        }

        long[] pre = new long[n];
        for (int i = 1; i < n; i++) {
            long cost = nums[i] - nums[i - 1];
            if (closest[i - 1] == i) cost = 1;
            pre[i] = pre[i - 1] + cost;
        }

        long[] suf = new long[n];
        for (int i = n - 2; i >= 0; i--) {
            long cost = nums[i + 1] - nums[i];
            if (closest[i + 1] == i) cost = 1;
            suf[i] = suf[i + 1] + cost;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            if (l < r) ans[i] = (int)(pre[r] - pre[l]);
            else ans[i] = (int)(suf[r] - suf[l]);
        }

        return ans;
    }
}