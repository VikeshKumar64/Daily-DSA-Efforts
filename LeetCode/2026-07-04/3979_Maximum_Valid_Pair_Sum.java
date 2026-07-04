class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int c = 0;
        int leftmax = 0;
        int sum = 0;
        for(int j = k; j < nums.length; j++){
            leftmax = Math.max(nums[c], leftmax);
            sum = Math.max(nums[j] + leftmax, sum);
            c++;
        }
    return sum;
    }
}