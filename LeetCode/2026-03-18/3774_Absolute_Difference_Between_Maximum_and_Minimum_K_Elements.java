class Solution {
    public int absDifference(int[] nums, int k) {
        int smallest = 0;
        int largest = 0;
        Arrays.sort(nums);
        for(int i = 0, j = nums.length - 1; i < k; i++, j--){
            largest += nums[j];
            smallest += nums[i];
        }

        return largest-smallest;
    }
}