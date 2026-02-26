class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;
        int decStart = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == decStart) return false;

        int incStart = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == incStart) return false;

        return i == n-1;
    }
}