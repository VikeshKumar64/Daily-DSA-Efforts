class Solution {
    public int minimumPrefixLength(int[] nums) {
        int len = nums.length;
        int i = len - 1;
        while(i > 0 && nums[i-1] < nums[i]){
            i--;
        }
        return i;
    }
}