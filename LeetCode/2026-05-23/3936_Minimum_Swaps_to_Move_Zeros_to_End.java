class Solution {
    public int minimumSwaps(int[] nums) {
        int ans = 0;
        int zeros = 0;
        for(int i : nums){
            if(i == 0) zeros++;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && i >= nums.length - zeros) continue;
            if(nums[i] == 0) ans++;
        }
        return ans;
    }
}