class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i : nums){
            right += i;
        }
        int arr[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = Math.abs(left - (right-nums[i]));
            left += nums[i];
            right = right - nums[i];
        }
        return arr;
    }
}