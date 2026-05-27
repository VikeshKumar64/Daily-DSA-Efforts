class Solution {
    public int atM(int nums[], int goal){

        if (goal < 0) return 0;
        int count = 0;
        int curSum = 0;
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            curSum += nums[r]%2;
            while(curSum > goal){
                curSum -= nums[l]%2;
                l++;
            }
            count = count + r - l + 1;
            
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atM(nums, k) - atM(nums, k - 1);
    }
}