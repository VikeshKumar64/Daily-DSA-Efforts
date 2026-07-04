class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length / 2];
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length / 2) continue;
            if(mid == nums[i]) return false;
        }
        return true;
    }
}