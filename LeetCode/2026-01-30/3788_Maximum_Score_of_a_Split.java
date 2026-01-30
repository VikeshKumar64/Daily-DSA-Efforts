class Solution {
    public long maximumScore(int[] nums) {
        int len = nums.length;
        long preffix[] = new long[len];
        long suffixMin[] = new long[len];
        long sum = 0;
        for(int i = 0; i < len; i++){
            sum += nums[i];
            preffix[i] = sum;
        }
        suffixMin[len-1] = nums[len-1];
        for(int i = len - 2; i >= 0; i--){
            suffixMin[i] = Math.min(nums[i], suffixMin[i+1]);
        }
        long max = Long.MIN_VALUE;
        for(int i = 0; i < len - 1; i++){
            max = Math.max(max, (preffix[i] - suffixMin[i+1]));
        }
        return max;
    }
}
// i think we don't need suffixMim[] 