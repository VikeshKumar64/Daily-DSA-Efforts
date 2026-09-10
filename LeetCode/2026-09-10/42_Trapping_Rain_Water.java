class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;

        int i = 0;

        while (i < n - 1) {

            int j = i + 1;

            while (j < n && height[j] < height[i]) {
                j++;
            }

            if (j == n) {
                j = i + 1;

                for (int k = i + 1; k < n; k++) {
                    if (height[k] > height[j]) {
                        j = k;
                    }
                }
            }

            int waterLevel = Math.min(height[i], height[j]);

            ans += waterLevel * (j - i - 1);

            for (int k = i + 1; k < j; k++) {
                ans -= height[k];
            }

            i = j;
        }

        return ans;
    }
}