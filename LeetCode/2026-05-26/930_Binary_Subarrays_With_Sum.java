class Solution {
    public int atM(int nums[], int goal){

        if (goal < 0) return 0;
        int count = 0;
        int curSum = 0;
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            curSum += nums[r];
            while(curSum > goal){
                curSum -= nums[l];
                l++;
            }
            count = count + r - l + 1;
            
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atM(nums, goal) - atM(nums, goal - 1);
    }
}