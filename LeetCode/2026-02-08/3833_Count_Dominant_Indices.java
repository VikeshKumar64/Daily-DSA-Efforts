class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int suffixSum[] = new int[n];
        suffixSum[n-1] = nums[n-1];
        for(int i = nums.length - 2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }
        
        int count = 0;
        
        for(int i = 0; i < n - 1; i++){
            int rightSum = suffixSum[i+1];
            int rightCount = n - i - 1;

            double avg = (double) rightSum / rightCount;
            if(nums[i] > avg){
                count++;
            }
        }
        return count;
    }
}