class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int h = n / 2;

        int total = 0;
        int leftSum = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < h; i++) {
            leftSum += nums[i];
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            if (leftSum > total - leftSum) {
                ans++;
            }
            leftSum = leftSum - nums[i] + nums[(i + h) % n];
        }
        return ans;
    }
}