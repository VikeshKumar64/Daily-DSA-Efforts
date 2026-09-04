class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int index = 0;
       for (int i = 0; i <= n - k; i++) {

            int max = Integer.MIN_VALUE;

            int j = i;

            while (j < i + k) {

                max = Math.max(max, nums[j]);

                j++;
            }

            ans[index] = max;
            index++;
        }

        return ans;
    }
}