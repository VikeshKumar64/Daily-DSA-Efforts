class Solution {
    public long minOperations(int[] nums) {
        long count = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                long dif = nums[i] - nums[i+1];
                count+= dif;
            }
        }
        return count;
    }
}