class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int curr = -1;
        int curr2 = -1;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                curr = i;
                if(curr2 != -1){
                    ans = Math.min(ans, Math.abs(curr - curr2));
                }
            }
            else if(nums[i] == 2){
                curr2 = i;
                if(curr != -1){
                    ans = Math.min(ans, Math.abs(curr - curr2));
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}